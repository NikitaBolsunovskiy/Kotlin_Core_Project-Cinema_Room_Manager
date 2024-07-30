fun main() {
    var max = -1
    var value = readln().toInt()
    while (value != 0) {
        max = if (max < value) value else max
        value = readln().toInt()
    }
    println(max)
}