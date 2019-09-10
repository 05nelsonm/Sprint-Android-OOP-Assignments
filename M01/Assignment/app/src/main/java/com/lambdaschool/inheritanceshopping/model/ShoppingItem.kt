package com.lambdaschool.inheritanceshopping.model

import android.graphics.drawable.Drawable
import java.io.Serializable

open class ShoppingItem(
    val colorId: Int,
    val productName: String,
    val drawableName: Drawable?

) {

    open fun getDisplayName(): String {
        return productName
    }

}

class GroceryItem(colorId: Int, productName: String, drawableName: Drawable?, val needsRefrigeration: Boolean): ShoppingItem(colorId, productName, drawableName) {
    override fun getDisplayName(): String {

        var refrigeration = ""
        if (needsRefrigeration) {
            refrigeration = "Chill It!"
        } else {
            refrigeration = "Pantry It!"
        }

        return "Product Name: $productName\nStorage Location: $refrigeration"
    }
}

class ClothingItem(colorId: Int, productName: String, drawableName: Drawable?, val size: String): ShoppingItem(colorId, productName, drawableName) {
    override fun getDisplayName(): String {
        return "Product Name: $productName\nSize: $size"
    }
}

class ElectronicsItem(colorId: Int, productName: String, drawableName: Drawable?, val onSale: Boolean): ShoppingItem(colorId, productName, drawableName) {
    override fun getDisplayName(): String {

        var itemOnSale = ""
        if (onSale) {
            itemOnSale = "Yup! Don't resist..."
        } else {
            itemOnSale = "Nope! Resist..."
        }

        return "Product Name: $productName\nItem Sale: $itemOnSale"
    }
}

object ShoppingListItem {
    val shoppingListItem = mutableListOf<ShoppingItem>()
}
