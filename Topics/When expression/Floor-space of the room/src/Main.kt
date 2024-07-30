import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val roomType = readln()
    when (roomType) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()
            val p = (a + b + c) / 2.0
            println(sqrt(p * (p - a) * (p - b) * (p - c)))
        }
        "rectangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            println((a * b).toDouble())
        }
        "circle" -> {
            val r = readln().toDouble()
            val pi = 3.14
            println(pi * r.pow(2))
        }
    }
}