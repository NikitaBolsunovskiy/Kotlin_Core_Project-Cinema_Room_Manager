import java.util.*

//Start of Kotlin Program
fun main(args: Array<String>) {

    //Create a scan instance for readling line from standard Input
    val scan = Scanner(System.`in`)

    // Reading an integer as input
    val userInput = scan.nextLine().trim()

    val isInteger = userInput.all { it.isDigit() }
    val intValue = if (isInteger) userInput.toInt() else 0
    val isInRange = intValue in 1..9999

    when {
        isInteger && isInRange -> {
            var sum = 0
            userInput.forEach { sum += it.toString().toInt() }
            println(sum)
        }
        else -> println("Invalid Input")
    }
}
// End of Kotlin Program