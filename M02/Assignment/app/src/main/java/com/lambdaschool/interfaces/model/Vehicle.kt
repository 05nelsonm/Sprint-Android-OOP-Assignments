package com.lambdaschool.interfaces.model

abstract class Vehicle(val id : String, val weight: Int, var favorite: Boolean) {
    abstract fun travel(): String
}

interface AirTravel {
    fun fly(): String
}

interface WaterTravel {
    fun sail(): String
}

interface GroundTravel {
    fun drive(): String
}

class JetPlane(id : String, weight: Int, favorite: Boolean): Vehicle(id, weight, favorite), AirTravel {
    override fun travel(): String {
        return fly()
    }

    override fun fly(): String {
        return "$id travels via pressure differentials created by its wings."
    }
}

class SpaceShuttle(id : String, weight: Int, favorite: Boolean): Vehicle(id, weight, favorite), AirTravel {
    override fun travel(): String {
        return fly()
    }

    override fun fly(): String {
        return "$id travels via rockets which are powered by a mixture of liquid oxygen and kerosene or liquid hydrogen"
    }
}

class SpeedBoat(id : String, weight: Int, favorite: Boolean): Vehicle(id, weight, favorite), WaterTravel {
    override fun travel(): String {
        return sail()
    }

    override fun sail(): String {
        return "$id travels via motor"
    }
}

class SailBoat(id : String, weight: Int, favorite: Boolean): Vehicle(id, weight, favorite), WaterTravel {
    override fun travel(): String {
        return sail()
    }

    override fun sail(): String {
        return "$id travels via wind"
    }
}

class Bus(id : String, weight: Int, favorite: Boolean): Vehicle(id, weight, favorite), GroundTravel {
    override fun travel(): String {
        return drive()
    }

    override fun drive(): String {
        return "$id travels via diesel fuel"
    }
}

class Car(id : String, weight: Int, favorite: Boolean): Vehicle(id, weight, favorite), GroundTravel {
    override fun travel(): String {
        return drive()
    }

    override fun drive(): String {
        return "$id travels via gasoline or DC power"
    }
}