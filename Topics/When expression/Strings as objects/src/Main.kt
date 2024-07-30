fun main() {
    val input = readLine()!!
    when {
        input.isEmpty() -> println()
        else -> println(when (input.first()) {
            'i' -> input.subSequence(1..input.lastIndex).toString().toInt() + 1
            's' -> input.subSequence(1..input.lastIndex).reversed().toString()
            else -> input
        })
    }
}