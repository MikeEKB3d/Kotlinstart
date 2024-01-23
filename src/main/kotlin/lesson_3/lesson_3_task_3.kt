package org.example.lesson_3

fun main() {
    val ishodnoeNumber = 7
    var counter = 1

    var tablica = """
        $ishodnoeNumber * ${counter}  = ${ishodnoeNumber * counter++}
        $ishodnoeNumber * ${counter} = ${ishodnoeNumber * counter++}
        $ishodnoeNumber * ${counter} = ${ishodnoeNumber * counter++}
        $ishodnoeNumber * ${counter} = ${ishodnoeNumber * counter++}
        $ishodnoeNumber * ${counter} = ${ishodnoeNumber * counter++}
        $ishodnoeNumber * ${counter} = ${ishodnoeNumber * counter++}
        $ishodnoeNumber * ${counter} = ${ishodnoeNumber * counter++}
        $ishodnoeNumber * ${counter} = ${ishodnoeNumber * counter++}
        $ishodnoeNumber * ${counter} = ${ishodnoeNumber * counter++}
   
    """.trimIndent()
    println(tablica)
}