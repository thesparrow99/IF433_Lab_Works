package oop_00000130569_MuhamadZhakyAlamsyah.Week_04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", 4)
    myCar.openTrunk() // Sudah diperbaiki dari openTruck
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar(
        brand = "BMW i8",
        numberOfDoors = 2,
        batteryCapacity = 100
    )
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk() // Bisa dipanggil karena ElectricCar inherit dari Car

    println("\n--- Testing Manager ---")
    val manager = Manager("Andi", 10000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println("\n--- Testing Developer ---")
    val developer = Developer("Budi", 8000000, "Kotlin")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}