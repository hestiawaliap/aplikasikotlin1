package com.example.applikasikotlin.example.myapp

class Aquarium(var width: Int = 40, var height: Int = 60, var length: Int = 90) {
    init {
        println("aquarium initializing")
    }

    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} liters")
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}

fun main() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
}class Aquarium(var width: Int = 20, var height: Int = 40, var length: Int = 100) {
    init {
        println("aquarium initializing")
    }

    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} liters")
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}

fun main() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
}
