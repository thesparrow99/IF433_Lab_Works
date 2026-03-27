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
    println("Regular Equality: ${reg1 == reg2}")

    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println("Data User: $data1")
    println("Data Equality: ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName, $userAge")

    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
    }
}