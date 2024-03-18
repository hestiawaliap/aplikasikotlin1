abstract class AquariumFish {
    abstract val color: String
}
class Shark: AquariumFish() {
    override val color = "grey"
    interface FishAction {
        fun eat()
    }
    class Shark: AquariumFish(), FishAction {
        override val color = "grey"
        override fun eat() {
            println("hunt and eat fish")
        }
    }

    class Plecostomus: AquariumFish(), FishAction {
        override val color = "gold"
        override fun eat() {
            println("eat algae")
        }
    }

    class Plecostomus: AquariumFish() {
        override val color = "gold"
    }
