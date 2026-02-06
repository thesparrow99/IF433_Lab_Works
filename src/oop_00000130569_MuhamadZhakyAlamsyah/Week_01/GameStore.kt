package oop_00000130569_MuhamadZhakyAlamsyah.Week_01

fun main() {
    val gameTitle = "JackThePiratesFindPrincess"
    val price = 999999

    printReceipt(
        title = gameTitle,
        finalPrice = calculateDiscount(price)
    )
}

fun printReceipt(title: String, finalPrice: Int) {
    println("--- Struk SteamKW ---")
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()