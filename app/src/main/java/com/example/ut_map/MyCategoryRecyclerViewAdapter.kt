package com.example.ut_map

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ImageView
import com.example.ut_map.databinding.FragmentItemBinding
import com.example.ut_map.data.DataSource.categories
import com.example.ut_map.model.Category

/**
 * [RecyclerView.Adapter] that can display a category from [categories].
 * TODO: Replace the implementation with code for your data type.
 */
class MyCategoryRecyclerViewAdapter(
    private val context: Context?,
    private val values: List<Category>
) : RecyclerView.Adapter<MyCategoryRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val resources = context?.resources
        val item = values[position]
        holder.contentView.text = item.name
        holder.imageView.setImageResource(item.imageResourceID)
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
        //val idView: TextView = binding.itemNumber
        val contentView: TextView = binding.content
        val imageView: ImageView = binding.imageView
        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }

}