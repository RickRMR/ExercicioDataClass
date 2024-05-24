package com.richard.atividadedataclass

fun main() {
    var dayOfWeek :dayOfWeek = dayOfWeek.Sunday
    println(dayOfWeek.translate)
    }
enum class dayOfWeek(val translate: String){
    Monday("Segunda"),
    Tuesday("Terça"),
    Wednesday("Quarta"),
    Thursday("Quinta"),
    Friday("Sexta"),
    Saturday("Sábado"),
    Sunday("Domingo");
}
