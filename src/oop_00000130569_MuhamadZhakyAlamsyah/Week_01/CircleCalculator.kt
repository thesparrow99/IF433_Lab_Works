package oop_00000130569_muhamadzhakyalamsyah.week01

fun main() {
    // REFACTOR: Tipe data : Double dihapus karena Kotlin sudah tahu 7.0 adalah Double
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")

    checkSize(area)
}

fun checkSize(area: Double) = when {
    area > 100 -> println("This is a Big Circle")
    else -> println("This is a Small Circle")
}