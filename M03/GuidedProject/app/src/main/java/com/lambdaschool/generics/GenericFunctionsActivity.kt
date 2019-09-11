package com.lambdaschool.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class GenericFunctionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic_functions)


    }

    override fun onStart() {
        super.onStart()
        val mySingleList = singleList("a")
        Toast.makeText(this, "Our first list contains ${mySingleList[0]}\n" +
                "Our second list contains ${mySingleList[0]}", Toast.LENGTH_SHORT).show()
    }

    fun <T> singleList(t: T): List<T> {
        val theList = ArrayList<T>()
        theList.add(t)
        return theList
    }
}
