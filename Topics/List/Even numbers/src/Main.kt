fun solution(numbers: List<Int>) {
    val filtered = numbers.filter { x -> x % 2 == 0 }
    println(filtered.joinToString(" "))
}