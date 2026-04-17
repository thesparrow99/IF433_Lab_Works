package oop_00000130569_MuhamadZhakyAlamsyah.Week_05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran Berhasil! Sisa saldo $accountName: $balance")
        } else {
            println("Saldo tidak cukup untuk melakukan pembayaran sebesar $amount")
        }
    }

    fun topUp(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Top-up Berhasil! Saldo $accountName sekarang: $balance")
        } else {
            println("Jumlah top-up harus lebih dari 0")
        }
    }
}