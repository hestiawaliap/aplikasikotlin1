package com.example.applikasikotlin.example.myapp
import java.lang.Math.PI

open class Aquarium (open var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    open var volume: Int
    @@ -18,5 +19,16 @@ open class Aquarium (open var length: Int = 100, var width: Int = 20, var height
    println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
}
}
class TowerTank (height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        // ellipse area = π * r1 * r2
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water = volume * 0.8
    override val shape = "cylinder"
}

