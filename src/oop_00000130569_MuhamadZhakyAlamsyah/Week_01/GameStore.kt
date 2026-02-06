package oop_00000130569_muhamadzhakyalamsyah.week01

fun main() {
    val gameTitle = "JackThePiratesFindPrincess"
    val price = 999999

    val userNote: String? = null

    printReceipt(
        title = gameTitle,
        finalPrice = calculateDiscount(price),
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("--- Struk SteamKW ---")
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan    : ${note ?: "Tidak ada catatan"}")
}