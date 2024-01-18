fun main() {

    val timeGagarin = 6480
    val timeGagarinMinuteAll = timeGagarin / 60
    val timeGagarinMinute = timeGagarinMinuteAll % 60
    val timeGagarinHour = timeGagarinMinuteAll / 60
    val timeGagarinSecond = timeGagarin % 60



    print("0$timeGagarinHour:$timeGagarinMinute:0$timeGagarinSecond")


}