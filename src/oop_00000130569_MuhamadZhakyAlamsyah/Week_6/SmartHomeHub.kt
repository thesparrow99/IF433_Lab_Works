package oop_00000130569_MuhamadZhakyAlamsyah.Week_6

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat ${device.name} berhasil ditambahkan ke SmartHome Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n--- Menjalankan perintah Matikan Semua Perangkat ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            } else {
                println("Info: ${device.name} bukan perangkat switchable, dilewati.")
            }
        }
        println("--- Semua sakelar yang kompatibel telah dimatikan ---\n")
    }
}