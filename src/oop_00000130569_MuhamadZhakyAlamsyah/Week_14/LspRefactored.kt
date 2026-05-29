package oop_00000130569_MuhamadZhakyAlamsyah.Week_14

interface Shape {
    fun area(): Int
}

class SafeRectangle(var width: Int, var height: Int) : Shape {
    override fun area() = width * height
}