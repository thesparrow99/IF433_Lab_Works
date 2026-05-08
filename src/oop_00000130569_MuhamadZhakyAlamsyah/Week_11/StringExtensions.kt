package oop_00000130569_muhamadzhakyalamsyah.week_11

fun String.addGreeting() : String {
    return "Hallo, $this"
}

fun String.repostTimes(n: Int): String {
    return this.repeat(n)
}

fun String?.isNullOrEmptyCustom(): Boolean {
    return this == null || this.isEmpty()
}