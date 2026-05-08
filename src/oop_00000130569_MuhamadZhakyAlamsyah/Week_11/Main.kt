package oop_00000130569_muhamadzhakyalamsyah.week_11

fun main(){
    println("=== TEST EXTENSION FUNCTION ===")
    println("Alex".addGreeting())
    println("Hi".repostTimes(3))

    val text: String? = null
    // Menggunakan nama fungsi yang baru: isNullOrEmptyCustom
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: $this")
        length * 2
    }
    println("Hasil kalkulasi run: $result")
}