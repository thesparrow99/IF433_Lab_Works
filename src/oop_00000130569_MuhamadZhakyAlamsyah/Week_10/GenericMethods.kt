package oop_00000130569_MuhamadZhakyAlamsyah.Week_10

fun <T> printData(data: T) {
    println("Data yang diterima: $data")
}

fun <T> processData(input: T): T {
    return input
}

fun <T> getMax(a: T, b: T): T where T : Comparable<T> {
    return if (a > b) a else b
}