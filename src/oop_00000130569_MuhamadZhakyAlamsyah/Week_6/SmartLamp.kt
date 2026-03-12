package oop_00000130569_MuhamadZhakyAlamsyah.Week_6

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu $name (ID: $id) sekarang menyala. Ruangan menjadi terang!")
    }

    override fun turnOff() {
        println("Lampu $name (ID: $id) telah dimatikan. Hemat energi!")
    }
}