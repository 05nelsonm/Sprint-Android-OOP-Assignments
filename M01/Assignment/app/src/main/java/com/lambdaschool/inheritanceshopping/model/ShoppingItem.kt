package com.lambdaschool.inheritanceshopping.model

import java.io.Serializable

open class ShoppingItem

    protected constructor (
    val colorId: Int,
    val productName: String

) {

    open fun getDisplayName(): String {
        return productName
    }

}

class GroceryItem(colorId: Int, productName: String, val needsRefrigeration: Boolean): ShoppingItem(colorId, productName) {
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

class ClothingItem(colorId: Int, productName: String, val waistSize: String): ShoppingItem(colorId, productName) {
    override fun getDisplayName(): String {
        return "Product Name: $productName\nWaist Size: $waistSize"
    }
}

class ElectronicsItem(colorId: Int, productName: String, val onSale: Boolean): ShoppingItem(colorId, productName) {
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
