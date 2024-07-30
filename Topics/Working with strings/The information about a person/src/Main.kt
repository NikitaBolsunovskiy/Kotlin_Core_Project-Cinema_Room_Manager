fun main() {
    val input = readln().split(" ")
    val firstName = input[0]
    val lastName = input[1]
    val age = input[2].toInt()

    println("${firstName.first()}. $lastName, $age years old")
}