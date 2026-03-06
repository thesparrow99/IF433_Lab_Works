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
}