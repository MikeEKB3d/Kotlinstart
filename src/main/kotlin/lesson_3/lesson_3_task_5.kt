package org.example.lesson_3

fun main() {
    var stroka = "D2-D4;0"
    val delim1 = "-"
    val delim2 = ";"
    val list = stroka.split(delim1, delim2)

    val nomerHoda = list[2]
    val nachaloHoda = list[0]
    val konecHoda = list[1]
    println(nomerHoda)
    println(nachaloHoda)
    println(konecHoda)


}
