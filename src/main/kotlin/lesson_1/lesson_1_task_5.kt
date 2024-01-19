fun main() {

    val timeGagarin = 6480
    val timeGagarinMinuteAll = timeGagarin / 60
    val timeGagarinMinute = timeGagarinMinuteAll % 60
    val timeGagarinHour = String.format("%02d", timeGagarinMinuteAll / 60)
    val timeGagarinSecond = String.format("%02d", timeGagarin % 60)



    println("$timeGagarinHour:$timeGagarinMinute:$timeGagarinSecond")



}