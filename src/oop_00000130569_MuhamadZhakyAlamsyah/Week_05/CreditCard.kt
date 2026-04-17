package oop_00000130569_MuhamadZhakyAlamsyah.Week_05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Transaksi Berhasil! Total penggunaan kartu $accountName: $usedAmount dari limit $limit")
        } else {
            println("Transaksi Ditolak! Penggunaan sebesar $amount akan melebihi limit kartu $accountName")
        }
    }
}