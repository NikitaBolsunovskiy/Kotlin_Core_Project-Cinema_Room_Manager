fun main() {
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()

    println(!(n1 == n2 || n2 == n3 || n1 == n3))
}