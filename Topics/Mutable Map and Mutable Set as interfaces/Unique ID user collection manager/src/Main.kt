fun main(args: Array<String>) {

    val users = mutableMapOf<String, String>()
    while (true) {
        val commandLine = readln()
        val arguments = commandLine.split(" ")
        val command = arguments[0]
        when (command) {
            "add" -> {
                val id = arguments[1]
                val name = arguments[2]
                when {
                    users.containsKey(id) -> {
                        println("ID exists")
                    }
                    else -> users[id] = name
                }
            }
            "remove" -> {
                val id = arguments[1]
                users.remove(id)
            }
            "end" -> {
                users.forEach { println("${it.key} ${it.value}") }
                break
            }
            else -> println("Unknown command")
        }
    }
}