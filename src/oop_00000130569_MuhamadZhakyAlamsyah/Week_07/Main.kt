package oop_00000130569_MuhamadZhakyAlamsyah.Week_07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println("Regular User: $reg1")
    println("Regular Equality: ${reg1 == reg2}") // False


}