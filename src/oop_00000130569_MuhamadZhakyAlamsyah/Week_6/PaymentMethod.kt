package oop_00000130569_MuhamadZhakyAlamsyah.Week_6

interface PaymentMethod  {
    fun pay(amount: Double)
}

class Gopay : PaymentMethod {
    override fun pay(amount: Double) { println("Processing $amount via Gopay Server.") }
}
class CreditCard : PaymentMethod {
    override fun pay(amount: Double) { println("Contacting Bank for Rp$amount") }
    }
