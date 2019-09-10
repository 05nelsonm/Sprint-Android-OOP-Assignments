package com.lambdaschool.inheritanceshopping.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
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

        val electronicsImage = getDrawable(R.drawable.ic_computer)
        val groceryImage = getDrawable(R.drawable.ic_grocery)
        val clothingImage = getDrawable(R.drawable.ic_clothing)

        ShoppingListItem.shoppingListItem.add(
            GroceryItem(R.color.colorGrocery, "Butter", groceryImage, true))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(R.color.colorElectronics, "Fractal Design Node 304 Mini ITX Tower Case", electronicsImage, false))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(R.color.colorGrocery, "Garlic", groceryImage, false))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(R.color.colorElectronics, "ASRock Z370M-ITX/ac Mini ITX LGA1151 Motherboard", electronicsImage, false))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(R.color.colorGrocery, "Cilantro", groceryImage, false))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(R.color.colorGrocery, "Habanero Peppers", groceryImage, false))
        ShoppingListItem.shoppingListItem.add(
            ClothingItem(R.color.colorClothing, "T-Shirt", clothingImage, "Medium"))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(R.color.colorGrocery, "Shrimp", groceryImage, true))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(R.color.colorElectronics, "Noctua NH-L9i 33.84 CFM CPU Cooler", electronicsImage, true))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(R.color.colorGrocery, "Limes", groceryImage, false))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(R.color.colorElectronics, "Intel Core i5-8400 2.8 GHz 6-Core Processor", electronicsImage, false))
        ShoppingListItem.shoppingListItem.add(
            ClothingItem(R.color.colorClothing, "Button Up Shirt", clothingImage, "15.5"))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(R.color.colorGrocery, "Onion", groceryImage, false))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(R.color.colorElectronics, "Noctua NF-A9 PWM 46.44 CFM 92 mm Fan", electronicsImage, true))
        ShoppingListItem.shoppingListItem.add(
            ClothingItem(R.color.colorClothing, "Board Shorts", clothingImage, "32"))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(R.color.colorGrocery, "Modelo Negra", groceryImage, true))
        ShoppingListItem.shoppingListItem.add(
            ClothingItem(R.color.colorClothing, "Sports Jacket", clothingImage, "42R"))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(R.color.colorElectronics, "EVGA SuperNOVA G3 550 W 80+ Gold Certified Fully Modular ATX Power Supply", electronicsImage, true))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(R.color.colorElectronics, "G.Skill Ripjaws V Series 32 GB (2 x 16 GB) DDR4-3200 Memory", electronicsImage, true))
        ShoppingListItem.shoppingListItem.add(
            ClothingItem(R.color.colorClothing, "Jeans", clothingImage, "32"))
        ShoppingListItem.shoppingListItem.add(
            ElectronicsItem(R.color.colorElectronics, "Noctua NF-A14 PWM 82.5 CFM 140 mm Fan", electronicsImage, true))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(R.color.colorGrocery, "Tomatos", groceryImage, false))
        ShoppingListItem.shoppingListItem.add(
            GroceryItem(R.color.colorGrocery, "Corn Flour Tortillas", groceryImage, false))

        val fragmentList = ShoppingItemFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.shopping_item_fragment_holder, fragmentList)
            .commit()
    }
}
