package oop_00000130569_MuhamadZhakyAlamsyah.Week_02

import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1   // Default 1 hari
) {

    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

fun main() {

    val scanner = Scanner(System.`in`)

    println("=== LIBRARY FINE SYSTEM ===")

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("Durasi tidak boleh minus. Diubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    val fine = loan.calculateFine()

    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: Rp $fine")
}
