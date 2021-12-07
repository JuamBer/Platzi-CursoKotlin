package aat_also

fun main(args: Array<String>){
    val moviles = mutableListOf("Google Pixel 2XL","Goggle Pixel 6 Pro","Huawei Redmi 9","Xiaomi Mi A3").also{
       lista -> println("El valro original de la lista es $lista")
    }.asReversed()

    println(moviles)

}