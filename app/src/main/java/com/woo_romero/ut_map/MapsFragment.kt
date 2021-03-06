package com.woo_romero.ut_map

import android.Manifest.permission.ACCESS_COARSE_LOCATION
import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.google.gson.Gson
import com.woo_romero.ut_map.data.DataSource.categories
import com.woo_romero.ut_map.data.DataSource.position
import com.woo_romero.ut_map.model.Location
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

class MapsFragment : Fragment() {
    private var markers: MutableList<Marker?> = mutableListOf()
    private val colors: List<Int> = listOf<Int>(
        R.color.burnt_orange, R.color.dark_gray, R.color.orange,
        R.color.light_green, R.color.green, R.color.teal, R.color.navy_blue, R.color.blue_grey
    )
    private lateinit var map: GoogleMap
    private val gson = Gson()

    //    private lateinit var clusterManager: ClusterManager<ClusterMarker>

    @SuppressLint("MissingPermission")
    private var activityResultLauncher: ActivityResultLauncher<Array<String>> =
        registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) { result ->
            var allAreGranted = true
            for (b in result.values) {
                allAreGranted = allAreGranted && b
            }

            if (allAreGranted) {
                map.isMyLocationEnabled = true
            }
        }

    private val callback = OnMapReadyCallback { googleMap ->
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        map = googleMap
        val path = context?.filesDir
        val letDirectory = File(path, "LET")
        letDirectory.mkdirs()
        val file = File(letDirectory, "favorites.json")

//        clusterManager = ClusterManager(context, map)
//        map.setOnCameraIdleListener(clusterManager)
//        map.setOnMarkerClickListener(clusterManager)
        for (marker in markers) {
            marker?.isVisible = false
            marker?.remove()
        }
        var index = 0
        val builder = LatLngBounds.Builder()
        try {
            val inputAsString = FileInputStream(file).bufferedReader().use { it.readText() }
            val favorites = gson.fromJson(inputAsString, Array<Location>::class.java)
            for (favorite in favorites){
                val position = LatLng(favorite.lat, favorite.long)
                val marker = map.addMarker(
                    MarkerOptions().position(position).title(favorite.name)
                        .visible(favorite.visibility).snippet(favorite.snippet).icon(
                            vectorToBitmap(
                                R.drawable.ic_baseline_favorite_24,
                                resources.getColor(colors[index % colors.size])
                            )
                        )
                )
                markers.add(marker)
//                clusterManager.addItem(ClusterMarker(location.lat,location.long, location.name, ""))
                builder.include(position)
            }
        }
        catch (e: java.lang.Exception){
            FileOutputStream(file).use{
                val list: List<Location> = listOf()
                it.write(gson.toJson(list.toTypedArray(), Array<Location>::class.java).toByteArray())
            }
        }
        index++
        try {
            var success = googleMap.setMapStyle(
                context?.let { MapStyleOptions.loadRawResourceStyle(it, R.raw.style_json) }
            )
            if (!success) {
                Log.e(String::class.toString(), "Style parsing failed.")
            }
        } catch (e: Exception) {
            Log.e(String::class.toString(), "Can't find style. Error: ", e)
        }



        for (category in categories) {
            for (location in category.list) {
                val position = LatLng(location.lat, location.long)
                val marker = map.addMarker(
                    MarkerOptions().position(position).title(location.name)
                        .visible(location.visibility).snippet(location.snippet).icon(
                            vectorToBitmap(
                                category.imageResourceID,
                                resources.getColor(colors[index % colors.size])
                            )
                        )
                )
                markers.add(marker)
//                clusterManager.addItem(ClusterMarker(location.lat,location.long, location.name, ""))
                builder.include(position)
            }
            index++
        }
        val bounds = builder.build()
        map.setLatLngBoundsForCameraTarget(bounds)
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(position, 15F))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
        activityResultLauncher.launch(arrayOf(ACCESS_COARSE_LOCATION, ACCESS_FINE_LOCATION))

    }

    /**
     * Demonstrates converting a [Drawable] to a [BitmapDescriptor],
     * for use as a marker icon.
     */
    private fun vectorToBitmap(@DrawableRes id: Int, @ColorInt color: Int): BitmapDescriptor? {
        val vectorDrawable = ResourcesCompat.getDrawable(resources, id, null)
        val bitmap = Bitmap.createBitmap(
            vectorDrawable!!.intrinsicWidth,
            vectorDrawable.intrinsicHeight, Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(bitmap)
        vectorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight())
        DrawableCompat.setTint(vectorDrawable, color)
        vectorDrawable.draw(canvas)
        return BitmapDescriptorFactory.fromBitmap(bitmap)
    }

//    inner class ClusterMarker(
//        lat: Double,
//        long: Double,
//        title: String,
//        snippet: String
//    ): ClusterItem {
//        private val position: LatLng
//        private val title: String
//        private val snippet: String
//
//        override fun getPosition(): LatLng {
//            return position
//        }
//
//        override fun getTitle(): String? {
//            return title
//        }
//
//        override fun getSnippet(): String? {
//            return snippet
//        }
//
//        init {
//            position = LatLng(lat, long)
//            this.title = title
//            this.snippet = snippet
//        }
//    }

}

