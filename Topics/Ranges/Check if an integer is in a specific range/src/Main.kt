import java.util.*

fun main(args: Array<String>) {
    // Scanner object to get user input
    val reader = Scanner(System.`in`)

    // Read a number from the input
    val number = reader.nextInt()

    println(if (number in 10..200) "In range" else "Not in range")
}