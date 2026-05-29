package oop_00000130569_MuhamadZhakyAlamsyah.Week_14

class MySQLDatabase {
    fun query(sql: String): List<String> = listOf("data1", "data2")
}

class UserService {
    private val database = MySQLDatabase() // Hard-coded! Tightly coupled!
    fun getUser(id: Int): List<String> = database.query("SELECT * FROM users WHERE id=$id")
}