package oop_00000130569_MuhamadZhakyAlamsyah.Week_6

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Smart Speaker $name menyala. Google Assistant siap membantu!")
    }

    override fun turnOff() {
        println("Smart Speaker $name dimatikan. Sampai jumpa!")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}