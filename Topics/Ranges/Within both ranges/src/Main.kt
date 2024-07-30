fun main() {

    val a1 = readln().toInt()
    val a2 = readln().toInt()
    val a3 = readln().toInt()
    val a4 = readln().toInt()
    val a5 = readln().toInt()

    val range1 = a1..a2
    val range2 = a3..a4

    println(a5 in range1 && a5 in range2)
}