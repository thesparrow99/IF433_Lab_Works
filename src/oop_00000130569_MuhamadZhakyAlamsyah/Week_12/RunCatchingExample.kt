package oop_00000130569_MuhamadZhakyAlamsyah.Week_12

un main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }