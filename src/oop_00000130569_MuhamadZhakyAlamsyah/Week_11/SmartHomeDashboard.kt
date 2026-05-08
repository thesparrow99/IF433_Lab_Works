package oop_00000130569_MuhamadZhakyAlamsyah.Week_11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}