fun main() {
    val count = readln().toInt()
    var sum = 0
    for (i in 1..count) {
        sum += readln().toInt()
    }
    println(sum)
}