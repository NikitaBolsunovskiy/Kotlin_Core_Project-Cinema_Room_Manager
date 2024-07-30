fun main() {
    var number = readln().toInt()
    print("$number ")
    while (number != 1) {
        number = if (number % 2 == 0) number / 2 else number * 3 + 1
        print("$number ")
    }

}