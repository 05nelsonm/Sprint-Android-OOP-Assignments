package com.lambdaschool.inheritanceshopping.model

import java.io.Serializable

class ShoppingItem (
    val colorId: Int,
    val productName: String
)

object ShoppingListItem {
    val shoppingListItem = mutableListOf<ShoppingItem>()
}