package com.lambdaschool.genericsassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        val exampleOfMutableList = mutableListOf<String>()
        //exampleOfMutableList.add(1)
        exampleOfMutableList.add("")

        val woodDesk = WoodDesk<Desk>()
        //woodDesk.put(SomethingElse())
        woodDesk.put(Desk())

        val stephan = "Stephan Livera"
        val marty = "Marty Bent"
        val pierre = "Pierre Rochard"

        val hostObservable = Observable.just(stephan, marty, pierre)
        hostObservable.subscribe() { v -> println(v) }

        val listOfPodcast = DummyNetworkAPI.makeListOfPodcast()
        listOfPodcast.subscribe() { v -> println(v) }
    }

    class WoodDesk<Desk> {
        private var desk: Desk? = null

        fun put(desk: Desk) {
            this.desk = desk
        }

        fun get(): Desk? {
            return desk
        }
    }

    data class Desk(val name: String = "Whalen")

    data class SomethingElse(val name: String = "something else")

    // Chose to deviate from the directions and do this instead of `Phone`
    open class FlowerVase

    class Tall(val color: String = "Transparent"): FlowerVase()

    class Short(val color: String = "Blue"): FlowerVase()

    class Flower<Y: FlowerVase, Z: FlowerVase>(private var vaseHeight_1: Y, private var vaseHeight_2: Z)

    data class Host(val name: String)

    data class Podcast(val showTitle: String, val episodes: Int, val rating: String)

    class DummyNetworkAPI {

        companion object {

            fun makeListOfPodcast(): Observable<List<Podcast>> {

                return Observable.just(

                    listOf(

                        Podcast(
                            "Stephan Livera Podcast",
                            106,
                            "10/10"
                        ),

                        Podcast(
                            "Tales From The Crypt",
                            97,
                            "9/10"
                        ),

                        Podcast(
                            "Noded",
                            60,
                            "8/10"
                        )
                    )
                )
            }
        }
    }
}
