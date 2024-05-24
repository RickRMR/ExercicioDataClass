package com.richard.atividadedataclass

fun main() {
    UtilityHelper.currentDay()
    UtilityHelper.setCurrentDay(UtilityHelper.DayOfWeek.Monday)
    UtilityHelper.currentDay()
    UtilityHelper.printWeekend()
    UtilityHelper.setCurrentDay(UtilityHelper.DayOfWeek.Sunday)
    UtilityHelper.currentDay()
    UtilityHelper.printWeekend()
}
object UtilityHelper {
    private var currentDay: DayOfWeek = DayOfWeek.Tuesday

    fun isWeekend(): Boolean {
        return currentDay == DayOfWeek.Saturday || currentDay == DayOfWeek.Sunday
    }

    fun setCurrentDay(newDay: DayOfWeek) {
        this.currentDay = newDay
    }

    fun currentDay() = println(currentDay)

    fun printWeekend() = println(isWeekend())

enum class DayOfWeek(){
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;
}}
