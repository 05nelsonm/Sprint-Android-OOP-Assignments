package com.lambdaschool.inheritanceshopping.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.inheritanceshopping.R
import com.lambdaschool.inheritanceshopping.fragment.ShoppingItemFragment
import com.lambdaschool.inheritanceshopping.model.ShoppingItem
import com.lambdaschool.inheritanceshopping.model.ShoppingListItem

class MainActivity : AppCompatActivity(), ShoppingItemFragment.OnShoppingItemListFragmentInteractionListener {

    override fun onShoppingItemListFragmentInteraction(item: ShoppingItem?) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))
        ShoppingListItem.shoppingListItem.add(ShoppingItem(22, "Item Name"))

        val fragmentList = ShoppingItemFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.shopping_item_fragment_holder, fragmentList)
            .commit()
    }
}
