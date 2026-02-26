package oop_00000130569_MuhamadZhakyAlamsyah.Week_04

open class Employee(
    val name: String,
    val baseSalary: Int
) {

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (baseSalary * 0.1).toInt()
    }
}