package oop_00000130569_MuhamadZhakyAlamsyah.Week_07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready")
    }
}
