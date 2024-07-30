import kotlin.math.min

fun main() {
    val count = readln().toInt()
    var counter = 1
    var printed = 0
    while (counter <= count) {
        val repeatCounts = min(counter, count - printed)
        val value = counter
        repeat(repeatCounts) {
            print("$value ")
            printed += 1
        }
        counter += 1
    }
}