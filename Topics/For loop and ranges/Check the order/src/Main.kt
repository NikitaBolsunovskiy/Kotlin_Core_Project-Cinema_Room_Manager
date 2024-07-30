fun main() {
    val count = readln().toInt()
    var array = intArrayOf()
    var ascendingOrder = true
    for (i in 1..count) {
        array = array.plus(readln().toInt())
        if (i > 1) {
            ascendingOrder = array[i - 2] <= array[i - 1]
            if (!ascendingOrder) break
        }
    }
    println(if (ascendingOrder) "YES" else "NO")
}