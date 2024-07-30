fun main() {
    val number = readln().toInt()
    when {
        (number > -15 && number <= 12) || (number in 15..16) || number >= 19 -> println("True")
        else -> println("False")
    }
}