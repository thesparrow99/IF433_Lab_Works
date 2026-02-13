package oop_00000130569_MuhamadZhakyAlamsyah.Week_02

import java.util.Scanner

class Hero(
    val name: String,
    var hp: Int = 100,
    val baseDamage: Int
) {

    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage

        if (hp < 0) {
            hp = 0
        }

        println("$name menerima $damage damage. Sisa HP: $hp")
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val reader = Scanner(System.`in`)

    println("=== CREATE YOUR HERO ===")
    print("Masukkan Nama Hero: ")
    val inputName = reader.nextLine()
    print("Masukkan Base Damage: ")
    val inputDamage = reader.nextInt()

    val myHero = Hero(inputName, baseDamage = inputDamage)
    var enemyHp = 100
    val enemyName = "Enemy"

    println("\n=== BATTLE START! ===")
    println("${myHero.name} vs $enemyName\n")

    while (myHero.isAlive() && enemyHp > 0) {
        println("--- Status ---")
        println("HP ${myHero.name}: ${myHero.hp}")
        println("HP $enemyName: $enemyHp")
        println("\nMenu:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = reader.nextInt()

        if (choice == 1) {
            myHero.attack(enemyName)
            enemyHp -= myHero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("HP $enemyName berkurang! Sisa HP: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("\n$enemyName membalas!")
                myHero.takeDamage(enemyDamage)
            }
        } else if (choice == 2) {
            println("\n${myHero.name} memilih untuk kabur dari medan tempur!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
        println()
    }

    println("=== GAME OVER ===")
    if (enemyHp <= 0) {
        println("Selamat! ${myHero.name} menang!")
    } else if (!myHero.isAlive()) {
        println("Sayang sekali, ${myHero.name} telah gugur...")
    } else {
        println("Pertarungan berakhir karena melarikan diri.")
    }
}