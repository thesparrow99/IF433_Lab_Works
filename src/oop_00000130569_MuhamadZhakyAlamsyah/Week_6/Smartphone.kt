package oop_00000130569_MuhamadZhakyAlamsyah.Week_6

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem oprasi smartphone berhasil booting.")
    }
}