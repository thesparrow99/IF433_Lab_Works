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
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
    val acUnit = run {
        val device = SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
        device // Menghasilkan (return) objek tersebut
    }
    homeDevices.add(acUnit)
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println("\n--- Hasil Pencarian Kamera ---")
        println(it.diagnose())
    }
    with(homeDevices) {
        println("\n=== DASHBOARD SUMMARY ===")
        println("Jumlah perangkat terdaftar: ${this.size} perangkat")
    }
    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }
    println("Total konsumsi daya: $totalPower Watt")

    println("\n=== DETAIL STATUS PERANGKAT ===")
    homeDevices.forEach {
        println(it.diagnose())
    }
}