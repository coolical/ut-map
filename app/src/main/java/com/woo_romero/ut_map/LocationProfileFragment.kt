package com.woo_romero.ut_map


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.gms.maps.model.LatLng
import com.google.gson.Gson
import com.woo_romero.ut_map.data.DataSource.position
import com.woo_romero.ut_map.model.Location
import java.io.*
import java.lang.Exception


/**
 * A simple [Fragment] subclass.
 * Use the [LocationProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LocationProfileFragment : Fragment() {
    private lateinit var location: Location
    private val gson: Gson = Gson()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            location = gson.fromJson(it.getString("location").toString(), Location::class.java)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for
        return inflater.inflate(R.layout.fragment_location_profile, container, false)
    }

    override fun onStart() {
        super.onStart()
        val nameView: TextView? = view?.findViewById(R.id.name)
        nameView?.text = location.name
        val tagsView: TextView? = view?.findViewById(R.id.tags)
        var tagsString: String = "Categories: "
        var index = 0
        while (index < location.tags.size - 1) {
            tagsString = tagsString + location.tags[index] + ", "
            index++
        }
        tagsString = tagsString + location.tags[index]
        tagsView?.text = tagsString
        val snippetsView: TextView? = view?.findViewById(R.id.snippet)
        snippetsView?.text = location.snippet
        val buttonView: Button? = view?.findViewById(R.id.positionButton)
        buttonView?.setOnClickListener {
            position = LatLng(location.lat, location.long)
            val action =
                LocationProfileFragmentDirections.actionLocationProfileFragmentToMapsFragment()
            view?.findNavController()?.navigate(action)
        }
        val favButton: Button? = view?.findViewById(R.id.favoriteButton)
        favButton?.setOnClickListener {
            val path = context?.filesDir
            val letDirectory = File(path, "LET")
            letDirectory.mkdirs()
            val file = File(letDirectory, "favorites.json")
            try {
                val inputAsString = FileInputStream(file).bufferedReader().use { it.readText() }
                Log.d("json", inputAsString)
                val favorites = gson.fromJson(inputAsString, Array<Location>::class.java).toMutableList()
                var index = 0
                var removed = false
                while (index < favorites.size && !removed ) {
                    if (favorites[index].name == location.name){
                        favorites.removeAt(index)
                        removed = true
                        Toast.makeText(this.context, "Location removed to favorites", Toast.LENGTH_SHORT).show()
                        break
                    }
                    index++

                }
                if (!removed){
                    favorites.add(location)
                    Toast.makeText(this.context, "Location added to favorites", Toast.LENGTH_SHORT).show()
                }
                FileOutputStream(file).use {
                    Log.d("modjson", gson.toJson(favorites.toTypedArray(), Array<Location>::class.java).toString())
                    it.write(gson.toJson(favorites.toTypedArray(), Array<Location>::class.java).toString().toByteArray())
                }
            }
            catch (e: FileNotFoundException){
                FileOutputStream(file).use{
                    val list = listOf(location)
                    Log.d("createjson", gson.toJson(list.toTypedArray(), Array<Location>::class.java))
                    it.write(gson.toJson(list.toTypedArray(), Array<Location>::class.java).toByteArray())
                    Toast.makeText(this.context, "Location added to favorites", Toast.LENGTH_SHORT).show()
                }
            }


        }
    }

    fun getJsonDataFromAsset(context: Context, fileName: String): String? {
        val jsonString: String
        try {
            jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }
        return jsonString
    }
}