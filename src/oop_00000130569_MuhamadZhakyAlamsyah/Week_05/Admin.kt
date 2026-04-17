package oop_00000130569_MuhamadZhakyAlamsyah.Week_05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer menlayani adminstrasi.")
    }
    fun doAdminWork(){
        println("[$nama] sedang merekap data abesensi mahasiwa.")
    }
}