fun main() {
    val size = readln().toInt()
    var max = -1
    repeat(size) {
        val value = readln().toInt()
        max = if (value % 4 ==0 && value > max) value else max
    }
    println(max)
}