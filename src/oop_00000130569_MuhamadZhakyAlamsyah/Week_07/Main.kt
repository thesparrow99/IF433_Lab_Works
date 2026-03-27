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

    val response: ApiResponse = ApiResponse.Success("Data loaded!")

    val message = when(response) {
        is ApiResponse.Success -> "Success: ${response.data}"
        is ApiResponse.Error -> "Error: ${response.message}"
        ApiResponse.Loading -> "Loading..."
    }
    println(message)

    println("\n=== TEST GAME MANAGER SINGLETON ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TEST SIMULASI RARITY & FACTORY ===")
    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata Awal: ${starterWeapon.item.name} | Damage: ${starterWeapon.item.damage}")
}