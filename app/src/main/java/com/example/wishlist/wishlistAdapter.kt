package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.wear.tiles.material.Button



// Create the basic adapter extending from RecyclerView.Adapter
// Note that we specify the custom ViewHolder which gives us access to our views
class wishlistAdapter(private val wishItems: List<wishlist>)  : RecyclerView.Adapter<wishlistAdapter.ViewHolder>() {

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val Button: Any = 0

        // Your holder should contain and initialize a member variable
        // for any view that will be set as you render a row
        val itemName = itemView.findViewById<TextView>(R.id.itemName)


    }
    // ... constructor and member variables
    // Usually involves inflating a layout from XML and returning the holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): wishlistAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val wishView = inflater.inflate(R.layout.item_list, parent, false)

        // Return a new holder instance
        return ViewHolder(wishView)
    }

    // Involves populating data into the item through holder
    override fun onBindViewHolder(listItems: wishlistAdapter.ViewHolder, position: Int) {
        // Get the data model based on position
        val wishItem: wishlist = wishItems.get(position)

        // Set item views based on your views and data model
        val textView = listItems.itemName



    }

    // Returns the total count of items in the list
    override fun getItemCount(): Int {
        return wishItems.size
    }
}