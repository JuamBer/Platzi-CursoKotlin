package aaf_when

fun main(args: Array<String>){
    //val nombreColor = "Purpura"
    //val nombreColor = "Rojo"
    //val nombreColor = "Amarillo"
    val nombreColor = "Carmesi"

    when(nombreColor){
        "Amarillo" -> {
            println("Es Amarillo")
        }
        "Rojo" -> {
            println("Es Rojo")
        }
    }
    when(nombreColor){
        "Amarillo" -> println("Es Amarillo")
        "Rojo" -> println("Es Rojo")
    }

    when(nombreColor){
        "Amarillo" -> println("Es Amarillo")
        "Rojo" -> println("Es Rojo")
        else -> println("Error")
    }

    when(nombreColor){
        "Amarillo" -> println("Es Amarillo")
        "Rojo","Carmesi" -> println("Es Rojo")
        else -> println("Error")
    }

    val code = 200
    when(code){
        in 200..299 -> println("code está entre 200 y 299")
        in 400..500 -> println("code está entre 400 y 500")
        else -> println("Error")
    }

    //val tallaDeZapatos = 41
    //val tallaDeZapatos = 44
    val tallaDeZapatos = 55
    val mensaje = when(tallaDeZapatos){
        41,43 -> "Tenemos disponible"
        42,44 -> "Casi no nos quedan"
        45 -> "No tenemos disponible"
        else -> "No tenemos disponible"
    }
    println(mensaje)

}
