package com.richard.atividadedataclass


fun main() {
    val base = Base("B" , "A", "S", "E")
    println(base)

    val (b, a, s, e) = base
    println(b)
    println(a)
    println(s)
    println(e)
}
data class Base(var B: String, var A:String, var S:String,var E:String){}



