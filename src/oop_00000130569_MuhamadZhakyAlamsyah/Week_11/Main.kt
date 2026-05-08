package oop_00000130569_MuhamadZhakyAlamsyah.Week_11

fun main(){
    println("=== TEST EXTENTION FUNCTION ===")
    println("Alex". addGreating())
    println("Hi". repostTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isnullOfEmptyCustom()}")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memperoses kata: $this")
        length * 2
    }
    println("Hasil kalkulalsi run: $result")

    fun main() {
        println("=== TEST APPLY ===")
        val user =User().apply {
            name = "Alex"
            age = 25
        }
        println(user)
    }
}