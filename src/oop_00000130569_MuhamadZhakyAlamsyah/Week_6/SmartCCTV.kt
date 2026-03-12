package oop_00000130569_MuhamadZhakyAlamsyah.Week_6

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("Kamera Keamanan $name (ID: $id) diaktifkan.")
        // Memanggil startRecord() secara otomatis saat perangkat dinyalakan
        startRecord()
    }

    override fun turnOff() {
        println("Kamera Keamanan $name dinonaktifkan.")
        // Secara opsional bisa memanggil stopRecord() di sini jika diinginkan
        stopRecord()
    }

    override fun startRecord() {
        println("Lensa sensor bergerak... Mulai merekam aktivitas di sekitar $name.")
    }

    // stopRecord() menggunakan default function dari interface,
    // jadi tidak wajib di-override kecuali ingin modifikasi teks.
}