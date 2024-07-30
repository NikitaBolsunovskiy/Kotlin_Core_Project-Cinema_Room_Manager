fun main() {
    val length = readln().toInt()
    var counter = 0
    repeat(length) {
        val value = readln().toInt()
        counter += if (value > 0) 1 else 0
    }
    println(counter)
}