package oop_00000130569_MuhamadZhakyAlamsyah.Week_6

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    println("\n=== TESTING SMART HOME SYSTEM ===")

    val myHub = SmartHomeHub()

    val lampuTamu = SmartLamp("L-001", "Ruang Tamu")
    val googleNest = SmartSpeaker("S-001", "Google Nest Dapur")
    val ezvizGarasi = SmartCCTV("C-001", "Ezviz Garasi")

    myHub.addDevice(lampuTamu)
    myHub.addDevice(googleNest)
    myHub.addDevice(ezvizGarasi)

    myHub.activateSecurityMode()

    myHub.turnOffAllSwitches()
}