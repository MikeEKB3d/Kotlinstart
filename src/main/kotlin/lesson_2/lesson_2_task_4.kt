
fun main() {
    val baff: Double = 0.2
    val cristalOre = 7
    val ironOre = 11
    val cristRud = "Бонусная кристаллическая руда"
    val ironRud = "Бонусная железная руда"
    val space = ' '

    val cristalBonus = (cristalOre * baff)
    val ironBonus = ironOre * baff

    println(cristRud + space + String.format("%.0f", cristalBonus))
    println(ironRud + space + String.format("%.0f", ironBonus))

}