package oop_00000130569_MuhamadZhakyAlamsyah.Week_08

import oop_00000130569_MuhamadZhakyAlamsyah.Week_07.BattleState

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke $emailAddress")
    }

    fun processUser(user: UserProfile) {
        if (user.email != null) {
            sendEmail(user.email)
        } else {
            print("User ${user.name} tidak memiliki email.")
        }
    }
}