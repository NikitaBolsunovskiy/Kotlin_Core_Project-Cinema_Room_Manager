import java.util.*

fun main(args: Array<String>) {
    // Create a mutable list to store the input numbers
    val numberList = mutableListOf<Int>()

    // Use a scanner to read the user input
    val scanner = Scanner(System.`in`)

    while (scanner.hasNextInt()) {
        numberList.add(scanner.nextInt())
    }

    numberList.sort()

    println(numberList.joinToString(" "))
}