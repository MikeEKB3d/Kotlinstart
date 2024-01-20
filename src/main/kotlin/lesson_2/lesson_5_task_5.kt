package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val vklad= 70000
    val percent = 0.167
    val years = 20
        // sum = x * (1+%) в степени n

val sumVklad = vklad*((1 + percent).pow(years))
    println(String.format("%.3f",sumVklad))
}