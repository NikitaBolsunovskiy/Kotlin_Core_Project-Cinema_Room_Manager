fun findCar(): String {
    val maxSpeed = readln().toInt()
    val accTime = readln().toInt()

    if (maxSpeed >= 120 && accTime in 1..4) return "I will definitely win!"
    throw Exception("The race can't be won with this car")
}