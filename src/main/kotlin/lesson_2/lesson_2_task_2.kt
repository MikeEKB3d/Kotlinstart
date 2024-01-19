package org.example.lesson_2

fun main() {
    val staff: Int = 50
    val paydayStaff1: Int = 30000

    val intern: Int = 30
    val paydayIntern1: Int =20000

    //Расходы на выплату зарплаты постоянных сотрудников
    val paydayStaffAll = staff * paydayStaff1

    //Общие расходы по ЗП после прихода стажеров
    val paydayAllPersonal = paydayStaffAll + (intern * paydayIntern1)

    //Среднюю ЗП одного сотрудника после устройства стажеров
    val averagePaydayAll = paydayAllPersonal / (staff + intern)

    println(paydayStaffAll)
    println(paydayAllPersonal)
    println(averagePaydayAll)
}