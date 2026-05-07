package oop_00000130569_MuhamadZhakyAlamsyah.Week_10

class MathBox<T : Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}