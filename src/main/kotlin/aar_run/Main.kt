package aar_run

fun main(args: Array<String>){
    val moviles = mutableListOf("Google Pixel 2XL","Goggle Pixel 6 Pro","Huawei Redmi 9","Xiaomi Mi A3")

    println(moviles)

    moviles.run{
        removeIf { movil -> movil.contains("Google") }
        this
    }

    println(moviles)
}