package aas_apply

fun main(args: Array<String>){
    val moviles = mutableListOf("Google Pixel 2XL","Goggle Pixel 6 Pro","Huawei Redmi 9","Xiaomi Mi A3")

    println(moviles)

    moviles.apply{
        removeIf { movil -> movil.contains("Google") }
    }

    println(moviles)

    var colores : MutableList<String>? = null

    colores?.apply{
        println("Nuestros colores son $this")
        println("Cantidad de colores son $size")
    }

    colores = mutableListOf("Amarillo","Azul","Rojo")

    colores?.apply{
        println("Nuestros colores son $this")
        println("Cantidad de colores son $size")
    }
}