fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    when {
        a < 0 || b < 0 || c < 0 -> println("NO")
        (a < b + c) && (b < a + c) && (c < a + b) -> println("YES")
        else -> println("NO")
    }

}