package oop_00000130569_MuhamadZhakyAlamsyah.Week_05

fun main() {
    // --- TESTING PEGAWAI (DOSEN & ADMIN) ---
    val dosen1 = Dosen(nama = "Pak Theo", nidn = "0123456")
    val admin1 = Admin(nama = "Budi")
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIFITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        when (pegawai) {
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen")
                pegawai.mengajar()
            }
        }
        println("------------------")
    }

    // --- TESTING MATH HELPER (OVERLOADING) ---
    val helper = MathHelper()
    println("\n--- HASIL TUGAS MANDIRI 1 ---")
    println("Luas Persegi (sisi 5): ${helper.hitungLuas(5)}")
    println("Luas Persegi Panjang (10x5): ${helper.hitungLuas(10, 5)}")
    println("Luas Lingkaran (r=7.0): ${helper.hitungLuas(7.0)}")

    // --- TESTING PAYMENT METHOD (E-WALLET & CREDIT CARD) ---
    val myEWallet = EWallet(accountName = "Zhaky E-Wallet", balance = 50000.0)
    val myCreditCard = CreditCard(accountName = "Zhaky Visa", limit = 100000.0)
    val listPembayaran: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    println("\n=== SMART CASTING CHALLENGE: PROSES 75.000 ===")
    for (metode in listPembayaran) {
        println("Memproses akun: ${metode.accountName}")
        metode.processPayment(75000.0)

        if (metode is EWallet) {
            println("=> Terdeteksi EWallet! Melakukan top-up otomatis...")
            metode.topUp(50000.0)
            println("=> Mencoba pembayaran ulang setelah top-up:")
            metode.processPayment(75000.0)
        } else if (metode is CreditCard) {
            val sisaLimit = metode.limit - metode.usedAmount
            println("=> Terdeteksi CreditCard! Limit tersedia: $sisaLimit")
        }
        println("----------------------------------------------")
    }
}