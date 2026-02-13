package oop_000000130569_MuhamadZhakyAlamsyah_Week2

class Student (
    val name : String,
    val nim : String,
    val major : String
)
class Student (val name : String, val nim : String, val major : String){
    init {
        if (nim.length !=5) {
            println("WARNING:Objek tercipta dengan NIM ($nim) yang valid!")
            println("Data mmahasiswa $name mungkin akan bermasalah di sistem.")
        }else {
            println("LOG: Objek Student $name berhasil dialokasikan di memory"
        }
    }
}