package oop_00000130569_MuhamadZhakyAlamsyah.Week_5

package oop_00000130569_MuhamadZhakyAlamsyah.Week_5

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)

    fun printReceipt(amount: Double) {
        println("Receipt for $accountName: Amount IDR $amount")
    }
}