package oop_000000130569_MuhamadZhakyAlamsyah_Week2

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

    println("=== TURN BASED TEXT GAME ===")

    val hero1 = Hero("Knight", baseDamage = 25)
    val hero2 = Hero("Orc", baseDamage = 20)

    println("\nBattle Start!\n")

    var turn = 1

    while (hero1.isAlive() && hero2.isAlive()) {

        println("----- TURN $turn -----")

        hero1.attack(hero2.name)
        hero2.takeDamage(hero1.baseDamage)

        if (!hero2.isAlive()) {
            println("${hero2.name} telah kalah!")
            break
        }

        hero2.attack(hero1.name)
        hero1.takeDamage(hero2.baseDamage)

        if (!hero1.isAlive()) {
            println("${hero1.name} telah kalah!")
            break
        }

        turn++
        println()
    }

    println("\n=== GAME OVER ===")
}
