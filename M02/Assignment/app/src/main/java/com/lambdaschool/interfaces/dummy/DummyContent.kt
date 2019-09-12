package com.lambdaschool.interfaces.dummy

import com.lambdaschool.interfaces.model.*
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object ListOfVehicles {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<Vehicle> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, Vehicle> = HashMap()

    init {
        ITEMS.add(JetPlane("Jet plane", 100000, true))
        ITEMS.add(SpaceShuttle("Space shuttle", 10000000, false))
        ITEMS.add(SpeedBoat("Speedboat", 7000, false))
        ITEMS.add(SailBoat("Sailboat", 100000, true))
        ITEMS.add(Bus("Bus", 35000, false))
        ITEMS.add(Car("Car", 10000, true))

        ITEM_MAP[ITEMS[0].id] = ITEMS[0]
        ITEM_MAP[ITEMS[1].id] = ITEMS[1]
        ITEM_MAP[ITEMS[2].id] = ITEMS[2]
        ITEM_MAP[ITEMS[3].id] = ITEMS[3]
        ITEM_MAP[ITEMS[4].id] = ITEMS[4]
        ITEM_MAP[ITEMS[5].id] = ITEMS[5]
    }
}
