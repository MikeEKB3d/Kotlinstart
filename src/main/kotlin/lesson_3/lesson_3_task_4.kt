package org.example.lesson_3

import java.awt.geom.Ellipse2D

fun main() {
    var nomerHoda: Int = 1
    var otkudaHod = "E2"
    var kudaHod = "E4"
    var stroka = "${nomerHoda++}. $otkudaHod - $kudaHod"
    println(stroka)

    otkudaHod = "D2"
    kudaHod = "D3"
    stroka = "${nomerHoda++}. $otkudaHod - $kudaHod"
    println(stroka)


}