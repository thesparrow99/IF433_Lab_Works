package oop_000000130569_MuhamadZhakyAlamsyah_Week2

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("---APLIKASI PMB UMN ---")

    println("Masukan Nama: ")
    val name = scanner.nextLine()

    println("Masukan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        println("Masukan Jurusan: ")
        val major = scanner.nextInt()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }

}