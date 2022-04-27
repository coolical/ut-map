package com.WooRomero.ut_map

import android.content.Context
import android.content.res.Configuration
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.WooRomero.ut_map.data.DataSource.categories
import com.WooRomero.ut_map.databinding.FragmentCategoryBinding
import com.WooRomero.ut_map.model.Category
import com.google.android.material.switchmaterial.SwitchMaterial

/**
 * [RecyclerView.Adapter] that can display a category from [categories].
 */
class MyCategoryRecyclerViewAdapter(
    private val context: Context?,
    private val values: List<Category>
) : RecyclerView.Adapter<MyCategoryRecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentCategoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val resources = context?.resources
        var currentNightMode = resources!!.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        val item = values[position]
        holder.contentView.text = item.name
        holder.imageView.setImageResource(item.imageResourceID)
        if (position % 2 == 0) {
            if (currentNightMode == Configuration.UI_MODE_NIGHT_NO) {
                holder.itemView.setBackgroundColor(resources?.getColor(R.color.grey) ?: return)
            } else if (currentNightMode == Configuration.UI_MODE_NIGHT_YES) {
                holder.itemView.setBackgroundColor(resources?.getColor(R.color.dark_gray) ?: return)
            }
        }
        if (item.toggle == false) {
            holder.button.toggle()
            holder.button.text = resources?.getString(R.string.button_text_off)
        }
        holder.button.setOnClickListener {
            if (item.toggle == false) {
                holder.button.text = resources?.getString(R.string.button_text_on)
            } else {
                holder.button.text = resources?.getString(R.string.button_text_off)
            }
            for (category in categories) {
                if (category.name == item.name) {
                    category.toggle = !category.toggle
                    for (location in category.list) {
                        location.visibility = !location.visibility
                    }
                    Toast.makeText(
                        context,
                        resources?.getString(R.string.button_onToggle, item.name),
                        Toast.LENGTH_SHORT
                    ).show()

                }
            }
        }
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val contentView: TextView = binding.content
        val imageView: ImageView = binding.imageView
        val button: SwitchMaterial = binding.button
    }

}