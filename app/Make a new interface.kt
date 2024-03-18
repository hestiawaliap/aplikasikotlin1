package com.example.applikasikotlin.example.myapp

abstract class AquariumFish {
    abstract val color: String
}
interface FishAction {
    fun eat()
}
class Shark: AquariumFish(), FishAction {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
    interface FishColor {
        val color: String
    }
    class Plecostomus: FishAction, FishColor {
        override val color = "gold"
        override fun eat() {
            println("eat algae")
        }

        class Plecostomus: AquariumFish(), FishAction {
            override val color = "gold"
            override fun eat() {
                println("eat algae")
            }
        }
        class Shark: FishAction, FishColor {
            override val color = "grey"
            override fun eat() {
                println("hunt and eat fish")
            }
        }