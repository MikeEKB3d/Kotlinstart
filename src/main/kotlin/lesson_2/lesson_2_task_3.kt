package org.example.lesson_2

fun main() {
    val timeHour = 9
    val timeMinute = 39
    val arriveTimeMinute = 457

    val arriveTimeHour = arriveTimeMinute / 60
    //println(arriveTimeHour)
    //  val arriveTimeMinuteEnd = arriveTimeMinute % 60
    //println(arriveTimeMinuteEnd)
    val timeEndMinuteAll = (timeHour * 60) + timeMinute + arriveTimeMinute
    //println(timeEndMinuteAll)
    val timeEndHour = timeEndMinuteAll / 60
    //println(timeEndHour)
    val timeEndMinute = timeEndMinuteAll % 60
    //println(timeEndMinute)
    println("$timeEndHour:$timeEndMinute")
}