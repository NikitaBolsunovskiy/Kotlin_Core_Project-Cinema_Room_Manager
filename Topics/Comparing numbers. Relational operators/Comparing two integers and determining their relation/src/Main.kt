import java.util.*

fun main(args: Array<String>) {
    // Scanner object for reading inputs.
    val reader = Scanner(System.`in`)

    val n1 = reader.nextInt()
    val n2 = reader.nextInt()

    val result = n1.compareTo(n2)

    if (result < 0) {
        println("less")
    } else if (result == 0) {
        println("equal")
    } else {
        println("greater")
    }
}