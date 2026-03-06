package oop_00000130569_MuhamadZhakyAlamsyah.Week_5

fun main() {
    val dosen1 = Dosen(nama = "Pak Theo", nidn = "0123456")
    val dosen2 = Dosen(nama = "Bu Siti", nidn = "0123456")

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
            }
        }
        println("------------------")
    }
    val helper = MathHelper()

    println("--- HASIL TUGAS MANDIRI 1 ---")
    println("Luas Persegi (sisi 5): ${helper.hitungLuas(5)}")
    println("Luas Persegi Panjang (10x5): ${helper.hitungLuas(10, 5)}")
    println("Luas Lingkaran (r=7.0): ${helper.hitungLuas(7.0)}")
    }
    fun main() {
        val myEWallet = EWallet(accountName = "Zhaky E-Wallet", balance = 50000.0)
        val myCreditCard = CreditCard(accountName = "Zhaky Visa", limit = 100000.0)

        val listPembayaran: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

        println("=== PROSES PEMBAYARAN SEJUMLAH 75.000 ===")

        for (metode in listPembayaran) {
            metode.processPayment(75000.0)

            when (metode) {
                is EWallet -> {
                    println("Info: Saldo E-Wallet saat ini adalah ${metode.balance}")
                    metode.topUp(25000.0)
                }
                is CreditCard -> {
                    println("Info: Sisa limit kartu adalah ${metode.limit - metode.usedAmount}")
                }
            }
            println("------------------------------------------")
        }

        val dosen1 = Dosen(nama = "Pak Theo", nidn = "0123456")
        val dosen2 = Dosen(nama = "Bu Siti", nidn = "0000000")
        val admin1 = Admin(nama = "Budi")

        val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

        println("\n=== AKTIFITAS PEGAWAI ===")
        for (pegawai in daftarPegawai) {
            pegawai.bekerja()
            when (pegawai) {
                is Admin -> {
                    println("=> Terdeteksi sebagai Admin")
                    pegawai.doAdminWork()
                }
                is Dosen -> {
                    println("=> Terdeteksi sebagai Dosen")
                }
            }
            println("------------------")
        }
        fun main() {
            val myEWallet = EWallet(accountName = "Zhaky E-Wallet", balance = 50000.0)
            val myCreditCard = CreditCard(accountName = "Zhaky Visa", limit = 100000.0)

            val listPembayaran: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

            println("=== SMART CASTING CHALLENGE: PROSES 75.000 ===")

            for (metode in listPembayaran) {
                println("Memproses akun: ${metode.accountName}")
                metode.processPayment(75000.0)

                if (metode is EWallet) {
                    println("=> Terdeteksi EWallet! Melakukan top-up otomatis...")
                    metode.topUp(50000.0)
                    println("=> Mencoba pembayaran ulang setelah top-up:")
                    metode.processPayment(75000.0)
                } else if (metode is CreditCard) {
                    println("=> Terdeteksi CreditCard! Limit tersedia: ${metode.limit - metode.usedAmount}")
                }

                println("----------------------------------------------")
            }

            val dosen1 = Dosen(nama = "Pak Theo", nidn = "0123456")
            val dosen2 = Dosen(nama = "Bu Siti", nidn = "0000000")
            val admin1 = Admin(nama = "Budi")

            val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

            println("\n=== AKTIFITAS PEGAWAI ===")
            for (pegawai in daftarPegawai) {
                pegawai.bekerja()
                when (pegawai) {
                    is Admin -> {
                        println("=> Terdeteksi sebagai Admin")
                        pegawai.doAdminWork()
                    }
                    is Dosen -> {
                        println("=> Terdeteksi sebagai Dosen")
                    }
                }
                println("------------------")
            }
        }
    }
}