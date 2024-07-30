// In Kotlin, you can use the standard input/output using the "readLine() method for input and the print/println functions for output.

fun main(args: Array<String>) {
    val inputString = readlnOrNull()!!

    println(reversedString(inputString))
}

fun reversedString(inputString: String): String {
    var result = ""
    for (counter in 0..inputString.lastIndex) {
        result += inputString[inputString.lastIndex - counter]
    }
    return result
}
