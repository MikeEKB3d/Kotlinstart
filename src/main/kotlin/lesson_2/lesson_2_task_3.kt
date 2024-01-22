package org.example.lesson_2

fun main() {
    val timeHour = 9
    val timeMinute = 39
    val arriveTimeMinute = 457
    val time = 60
    val timeEndMinuteAll = (timeHour * time) + timeMinute + arriveTimeMinute
    val timeEndHour = timeEndMinuteAll / time
    val timeEndMinute = timeEndMinuteAll % time

    println("$timeEndHour:$timeEndMinute")
}