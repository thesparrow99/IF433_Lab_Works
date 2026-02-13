package oop_000000130569_MuhamadZhakyAlamsyah_Week2

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

    print("Masukkan Lama Peminjaman (hari): ")
    val duration = scanner.nextInt()

    val loan = Loan(title, borrower, duration)

    val fine = loan.calculateFine()

    println("\n--- RINGKASAN PEMINJAMAN ---")
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanDuration} hari")
    println("Total Denda: Rp $fine")
}
