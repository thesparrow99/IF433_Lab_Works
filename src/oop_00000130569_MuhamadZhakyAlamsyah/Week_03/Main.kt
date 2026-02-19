package oop_00000130569_MuhamadZhakyAlamsyah.Week_03

fun main () {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.incrasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}