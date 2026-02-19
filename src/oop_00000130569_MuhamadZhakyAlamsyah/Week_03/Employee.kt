package oop_00000130569_MuhamadZhakyAlamsyah.Week_03

class Employee (val name: String) {

    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }
private var performanceRating: Int = 3

val tax: Double
    get() = salary * 0.1

fun incrasePerformance() {
    performanceRating++
    println("Kinerja $name meningkakt! Rating: $performanceRating")
}

fun printStatus(){
    println("Karyawan: $name, Rating: $performanceRating")
}
}
