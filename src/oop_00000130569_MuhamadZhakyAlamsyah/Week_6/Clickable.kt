package oop_00000130569_MuhamadZhakyAlamsyah.Week_6

interface Clickable {
    val name: String // Abstract property, tidak ada nilai default
    fun click()
}
class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}
