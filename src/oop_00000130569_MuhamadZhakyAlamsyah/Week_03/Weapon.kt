package oop_00000130569_MuhamadZhakyAlamsyah.Week_03

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    println("Damage tidak boleh negatif yaa ! Nilainya gabole diubah.")
                }
                value > 1000 -> {
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "AWW SAKIT BANGET"
            damage > 500 -> "AW AW SAKIT"
            else -> "b aja"
        }
}