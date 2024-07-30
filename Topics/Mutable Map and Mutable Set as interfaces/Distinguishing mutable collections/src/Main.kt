// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    val set2: MutableSet<Int> = linkedSetOf(4, 5, 6)

    val map2: Map<Int, String> = hashMapOf(3 to "cherry", 4 to "date")

    val set1: Set<Int> = mutableSetOf(1, 2, 3)

    val map1 = mutableMapOf(1 to "apple", 2 to "banana")

    val map3: MutableMap<Int, String> = mapOf(5 to "elderberry").toMutableMap()
}
