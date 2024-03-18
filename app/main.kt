package com.example.applikasikotlin.example.myapp

fun buildAquarium() {
    val aquarium6 = Aquarium(numberOfFish = 29)
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")
}

fun main() {
    buildAquarium()
}