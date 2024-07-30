import java.util.Scanner

fun main(args: Array<String>) {
    // Create a Scanner object for taking input
    val reader = Scanner(System.`in`)

    // Read an integer input
    val limit = reader.nextInt()

    // Check if limit is less than 0
    if (limit < 0) {
        println("Invalid Input")
    } else {
        var sum = 0
        var current = 1
        repeat(limit) {
            sum += current * current * if (current % 2 == 0) 1 else 0
            current += 1
        }
        println(sum)
    }
}