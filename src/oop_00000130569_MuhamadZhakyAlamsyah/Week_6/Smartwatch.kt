package oop_00000130569_MuhamadZhakyAlamsyah.Week_6

class Smartwatch : Watch(), BluetoothConnecttable , Rechargeable {

    override fun showtime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W")
    }
}