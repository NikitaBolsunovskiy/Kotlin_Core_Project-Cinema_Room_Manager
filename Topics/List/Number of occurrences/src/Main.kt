fun solution(strings: List<String>, str: String): Int {
    var counter = 0
    strings.forEach { if (it == str) counter++ }
    return counter
}