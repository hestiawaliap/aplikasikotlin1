package com.example.applikasikotlin.example.myapp

interface FishAction {
    fun eat()

}
interface FishColor {
    val color: String
}
object GoldColor : FishColor {
    override val color = "gold"
}
class Plecostomus(fishColor: FishColor = GoldColor):  FishAction,
    FishColor by fishColor {
    class PrintingFishAction(val food: String) : FishAction {
        override fun eat() {
            println("eat algae")
            println(food)
        }
    }
    class Plecostomus (fishColor: FishColor = GoldColor):
        FishAction by PrintingFishAction("eat algae"),
        FishColor by fishColor


    class Shark: FishAction, FishColor {
        @@ -23,11 +26,7 @@ class Shark: FishAction, FishColor {
            println("hunt and eat fish")
        }
    }
    class PrintingFishAction(val food: String) : FishAction {
        override fun eat() {
            println(food)
        }
    }

