package cinema

const val priceFront = 10
const val priceBack = 8

fun main() {

    val cinemaMap = initCinema()
    processMenu(cinemaMap)

}

fun processMenu(cinemaMap: MutableList<MutableList<String>>) {

    while (true) {

        println()
        println("""
            1. Show the seats
            2. Buy a ticket
            3. Statistics
            0. Exit
        """.trimIndent())

        val input = readln().toInt()

        when (input) {
            1 -> showCinemaStatus(cinemaMap)
            2 -> bookSeatInCinema(cinemaMap)
            3 -> showStatistics(cinemaMap)
            0 -> break
        }
    }
}

fun showStatistics(cinemaMap: MutableList<MutableList<String>>) {
    val purchased = totalPurchased(cinemaMap)
    val percentage = purchased.toDouble() * 100 / (cinemaMap.size * cinemaMap[0].size)
    val currentIncome = currentIncome(cinemaMap)
    val totalIncome = totalIncome(cinemaMap)
    println("""
        Number of purchased tickets: $purchased
        Percentage: ${"%.2f".format(percentage)}%
        Current income: $$currentIncome
        Total income: $$totalIncome
    """.trimIndent())
}

fun currentIncome(cinemaMap: MutableList<MutableList<String>>): Int {
    var result = 0
    cinemaMap.forEachIndexed { rowIndex, rows ->
        rows.forEach { seatStatus ->
            result += if (seatStatus == "B") seatPrice(rowNumber = rowIndex + 1 , cinemaMap = cinemaMap) else 0
        }
    }
    return result
}

fun totalIncome(cinemaMap: MutableList<MutableList<String>>): Int {
    var result = 0
    cinemaMap.forEachIndexed { rowIndex, rows ->
        rows.forEach { _ ->
            result += seatPrice(rowNumber = rowIndex + 1 , cinemaMap = cinemaMap)
        }
    }
    return result
}

fun totalPurchased(cinemaMap: MutableList<MutableList<String>>): Int {
    var result = 0
    cinemaMap.forEach { row -> row.forEach { seatStatus -> if (seatStatus == "B") result += 1 } }
    return result
}

fun initCinema(): MutableList<MutableList<String>> {

    println("Enter the number of rows:")
    val rowCount = readln().toInt()
    println("Enter the number of seats in each row:")
    val seatsCountInRow = readln().toInt()

    return buildCinemaMap(rowCount, seatsCountInRow)
}

fun buildCinemaMap(rowCount: Int, seatsCountInRow: Int): MutableList<MutableList<String>> {

    val result = mutableListOf<MutableList<String>>()

    for (i in 1..rowCount) {
        result.add(
            mutableListOf()
        )
        for (j in 1..seatsCountInRow) {
            result[i - 1].add("S")
        }
    }

    return result
}

fun bookSeatInCinema(cinemaMap: MutableList<MutableList<String>>) {

    while (true) {

        println("Enter a row number:")
        val rowNumber = readln().toInt()
        println("Enter a seat number in that row:")
        val seatNumber = readln().toInt()

        try {
            val seatStatus = cinemaMap[rowNumber - 1][seatNumber - 1]
            when (seatStatus) {
                "B" -> println("That ticket has already been purchased!")
                else -> {
                    showPriceForSeat(rowNumber, cinemaMap)
                    cinemaMap[rowNumber - 1][seatNumber - 1] = "B"
                    break
                }
            }
        } catch (e: IndexOutOfBoundsException) {
            println("Wrong input!")
        }
    }

}

fun showPriceForSeat(rowNumber: Int, cinemaMap: MutableList<MutableList<String>>) {
    val seatPrice: Int = seatPrice(cinemaMap, rowNumber)
    println("Ticket price: \$$seatPrice")
}

private fun seatPrice(
    cinemaMap: MutableList<MutableList<String>>,
    rowNumber: Int
): Int {
    val rowCount = cinemaMap.size
    val seatsCountInRow = cinemaMap[0].size
    val totalSeats = rowCount * seatsCountInRow

    val priceForBackSeats: Int
    val priceForFrontSeats: Int

    when {
        totalSeats <= 60 -> {
            priceForBackSeats = priceFront
            priceForFrontSeats = priceFront
        }

        else -> {
            priceForBackSeats = priceBack
            priceForFrontSeats = priceFront
        }
    }

    val seatPrice: Int = if (isFrontSeat(rowNumber, cinemaMap)) {
        priceForFrontSeats
    } else {
        priceForBackSeats
    }
    return seatPrice
}

fun isFrontSeat(rowNumber: Int, cinemaMap: MutableList<MutableList<String>>): Boolean {
    val lastFrontRow: Int = cinemaMap.size / 2
    return rowNumber <= lastFrontRow
}

fun showCinemaStatus(cinemaMap: MutableList<MutableList<String>>) {

    println("Cinema:")
    var columnsString = " "
    for (j in 1..cinemaMap[0].size) {
        columnsString += " $j"
    }
    println(columnsString)
    for (i in 1..cinemaMap.size) {
        var rowString = "$i"
        for (j in 1..cinemaMap[0].size) {
            rowString += " ${cinemaMap[i - 1][j - 1]}"
        }
        println(rowString)
    }
}

