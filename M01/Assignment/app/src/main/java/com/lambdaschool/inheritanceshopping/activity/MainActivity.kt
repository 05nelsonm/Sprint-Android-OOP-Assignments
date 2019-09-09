package com.lambdaschool.inheritanceshopping.activity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.inheritanceshopping.R
import com.lambdaschool.inheritanceshopping.fragment.ShoppingItemFragment
import com.lambdaschool.inheritanceshopping.model.*

class MainActivity : AppCompatActivity(),
    ShoppingItemFragment.OnShoppingItemListFragmentInteractionListener {

    override fun onShoppingItemListFragmentInteraction(item: ShoppingItem?) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ShoppingListItem.shoppingListItem.add(
            GroceryItem(Color.GREEN, "Butter", true))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(Color.RED, "Fractal Design Node 304 Mini ITX Tower Case", false))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(Color.GREEN, "Garlic", false))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(Color.RED, "ASRock Z370M-ITX/ac Mini ITX LGA1151 Motherboard", false))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(Color.GREEN, "Cilantro", false))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(Color.GREEN, "Habanero Peppers", false))
        ShoppingListItem.shoppingListItem.add(
            ClothingItem(Color.YELLOW, "T-Shirt", "Medium"))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(Color.GREEN, "Shrimp", true))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(Color.RED, "Noctua NH-L9i 33.84 CFM CPU Cooler", true))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(Color.GREEN, "Limes", false))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(Color.RED, "Intel Core i5-8400 2.8 GHz 6-Core Processor", false))
        ShoppingListItem.shoppingListItem.add(
            ClothingItem(Color.YELLOW, "Button Up Shirt", "15.5"))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(Color.GREEN, "Onion", false))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(Color.RED, "Noctua NF-A9 PWM 46.44 CFM 92 mm Fan", true))
        ShoppingListItem.shoppingListItem.add(
            ClothingItem(Color.YELLOW, "Board Shorts", "32"))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(Color.GREEN, "Modelo Negra", true))
        ShoppingListItem.shoppingListItem.add(
            ClothingItem(Color.YELLOW, "Sports Jacket", "42R"))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(Color.RED, "EVGA SuperNOVA G3 550 W 80+ Gold Certified Fully Modular ATX Power Supply", true))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(Color.RED, "G.Skill Ripjaws V Series 32 GB (2 x 16 GB) DDR4-3200 Memory", true))
        ShoppingListItem.shoppingListItem.add(
            ClothingItem(Color.YELLOW, "Jeans", "32"))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(Color.RED, "Noctua NF-A14 PWM 82.5 CFM 140 mm Fan", true))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(Color.GREEN, "Tomatos", false))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(Color.GREEN, "Corn Flour Tortillas", false))

        val fragmentList = ShoppingItemFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.shopping_item_fragment_holder, fragmentList)
            .commit()
    }
}
