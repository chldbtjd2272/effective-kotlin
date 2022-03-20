package item2

object Item2 {

    fun getWeather(degrees: Int) :String {
        val (description,color) = when{
            degrees < 5 -> "cold" to "BLUE"
            degrees < 23 -> "mild" to "YELLOW"
            else -> "hot" to "RED"
        }
        return "$description-$color"
    }
}