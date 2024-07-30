fun main() {
    val count = readln().toInt()

    if (count == 1) {
        println(readln().toInt())
        return
    }
    var values = emptyArray<Int>()
    for (i in 1..count) {
        values += readln().toInt()
    }
    values.sort()
    println(values[values.lastIndex] * values[values.lastIndex - 1])
}