package oop_00000130569_MuhamadZhakyAlamsyah.Week_08

package oop_00000130569_MuhamadZhakyAlamsyah.Week_08

sealed class Product

data class Electronic(val id: String, val name: String, val warrantyMonths: Int) : Product()

data class Clothing(val id: String, val name: String, val size: String) : Product()