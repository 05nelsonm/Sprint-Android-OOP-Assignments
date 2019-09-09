package com.lambdaschool.inheritanceshopping.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.lambdaschool.inheritanceshopping.R


import com.lambdaschool.inheritanceshopping.fragment.ShoppingItemFragment.OnShoppingItemListFragmentInteractionListener
import com.lambdaschool.inheritanceshopping.model.ShoppingItem

import kotlinx.android.synthetic.main.fragment_shoppingitem.view.*

/**
 * [RecyclerView.Adapter] that can display a [DummyItem] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class ShoppingItemRecyclerViewAdapter(
    private val mValues: List<ShoppingItem>,
    private val mListener: OnShoppingItemListFragmentInteractionListener?
) : RecyclerView.Adapter<ShoppingItemRecyclerViewAdapter.ViewHolder>() {

    private val mOnClickListener: View.OnClickListener

    init {
        mOnClickListener = View.OnClickListener { v ->
            val item = v.tag as ShoppingItem
            // Notify the active callbacks interface (the activity, if the fragment is attached to
            // one) that an item has been selected.
            mListener?.onShoppingItemListFragmentInteraction(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_shoppingitem, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        holder.mIdView.text = item.getDisplayName()
        holder.mIdView.setBackgroundColor(item.colorId)

        with(holder.mView) {
            tag = item
            setOnClickListener(mOnClickListener)
        }
    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mIdView: TextView = mView.tv_shopping_item
        /*val mContentView: TextView = mView.content

        override fun toString(): String {
            return super.toString() + " '" + mContentView.text + "'"
        }*/
    }
}
