package oop_00000130569_MuhamadZhakyAlamsyah.Week_04

class ElectricCar(
    brand: String,
    numberOfDoors: Int,
    val batteryCapacity: Int
) : Car(brand, numberOfDoors) {

    final override fun accelerate() {
        speed += 20 // Akselerasi mobil listrik biasanya lebih cepat
        println("$brand berakselerasi dalam sunyi. Kecepatan: $speed km/jam. Kapasitas baterai: $batteryCapacity%.")
    }
}