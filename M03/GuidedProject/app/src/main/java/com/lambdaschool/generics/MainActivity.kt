package com.lambdaschool.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO 1: list of strings

        val listOfStrings = mutableListOf("a", "b", "c")
        listOfStrings.add("d")

        // TODO 2: Create a class

        class Box<T> {

            private var contents: T? = null

            fun put(t: T) {
                contents = t
            }

            fun get(): T? {
                return contents
            }
        }

        val stringBox = Box<String>()
        stringBox.put("a string")
        //stringBox.put(1) // can't put it in there, it's a type string!
        println(stringBox.get())

        val intBox = Box<Int>()
        intBox.put(1)
        println(intBox.get())

    }
}

// class was created during break that I missed
/*
class Box<T>(private var item: T) {

    var open = false

    fun fetch(): T? {
        return item.takeIf { open }
    }
}*/
