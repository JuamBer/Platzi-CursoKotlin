package aap_let

fun main(args: Array<String>){
    var nombre : String? = null

    nombre?.let{
        valor -> println("El nombre no es nulo, es $valor")
    }

    nombre = "Pepe"

    nombre?.let{
            valor -> println("El nombre no es nulo, es $valor")
    }
}