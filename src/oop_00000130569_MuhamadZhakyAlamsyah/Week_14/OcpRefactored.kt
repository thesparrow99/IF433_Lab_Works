package oop_00000130569_MuhamadZhakyAlamsyah.Week_14

interface DiscountStrategy {
    fun apply(price: Double): Double
}

class StudentDiscount : DiscountStrategy {
    override fun apply(price: Double): Double = price * 0.80
}