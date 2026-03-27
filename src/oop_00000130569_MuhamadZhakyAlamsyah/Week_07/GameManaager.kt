package oop_00000130569_MuhamadZhakyAlamsyah.Week_07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        } else {
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}