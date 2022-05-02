package com.woo_romero.ut_map

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.woo_romero.ut_map.data.DataSource.locations
import com.woo_romero.ut_map.databinding.FragmentLocationBinding
import com.woo_romero.ut_map.model.Location


/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyLocationRecyclerViewAdapter(
    val context: Context?
) : RecyclerView.Adapter<MyLocationRecyclerViewAdapter.ViewHolder>(), Filterable {
    var filteredLocations: List<Location> = locations
    var originalLocations: List<Location> = locations

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentLocationBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = filteredLocations.get(position)
        holder.nameView.text = item.name
        holder.button.setOnClickListener {
            val gson = Gson()
            val action =
                LocationFragmentDirections.actionLocationFragmentToLocationProfileFragment(gson.toJson(item))
            holder.view.findNavController().navigate(action)
        }
    }


    override fun getItemCount(): Int = filteredLocations.size

    inner class ViewHolder(binding: FragmentLocationBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val nameView: TextView = binding.name
        val button: Button = binding.locationButton
        val view = binding.root

    }

    override fun getFilter(): Filter {
//        if (filter == null){
//            filter = CustomFilter(originalLocations, this)
//        }
//        Log.d("getFilter", filteredLocations.toString())
//        notifyDataSetChanged()
//        return filter as Filter
        return object : Filter() {
            override fun performFiltering(p0: CharSequence?): FilterResults {
                val results = FilterResults()
                if (p0 != null && p0.length > 0) {
                    val constraint = p0.toString().uppercase()
                    val filteredLocations: MutableList<Location> = mutableListOf()
                    for (location in originalLocations) {
                        if (location.name.toUpperCase().contains(constraint)) {
                            filteredLocations.add(location)
                        }
                    }
                    results.count = filteredLocations.count()
                    results.values = filteredLocations

                } else {
                    results.count = originalLocations.size
                    results.values = originalLocations
                }
                return results
            }

            override fun publishResults(p0: CharSequence?, p1: FilterResults?) {
                filteredLocations = if (p1?.values == null) ArrayList() else
                    p1.values as List<Location>
                notifyDataSetChanged()
            }
        }
    }


}