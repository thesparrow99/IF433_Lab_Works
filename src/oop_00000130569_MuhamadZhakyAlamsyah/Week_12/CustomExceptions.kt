package oop_00000130569_MuhamadZhakyAlamsyah.Week_12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")