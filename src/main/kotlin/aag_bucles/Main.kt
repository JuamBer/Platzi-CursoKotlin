package aag_bucles

fun main(args: Array<String>){

    //WHILE
    println("\n\nWHILE")
    var contador = 10
    while (contador > 0){
        println("El valor del contador es $contador")
        contador--
    }

    //DO WHILE
    println("\n\nDO WHILE")
    do{
        println("Generando número aleatorio")
        val numeroAleatorio = (0..100).random()
        println("El número aleatorio es: $numeroAleatorio")
    }while (numeroAleatorio > 50)


    //FOR
    println("\n\nFOR")
    val listaDeFrutas = listOf("Manzana","Pera","Frambuesa","Durazno")

    for (fruta in listaDeFrutas){
       println("Hoy voy a comerme $fruta")
    }

    //FOR REDUCIDO
    println("\n\nFOR REDUCIDO")
    for (fruta in listaDeFrutas) println("Hoy voy a comerme $fruta")

    //FOR EACH
    println("\n\nFOR EACH")
    listaDeFrutas.forEach{ fruta -> println("Hoy voy a comerme $fruta")}

    //MAP
    println("\n\nMAP")
    val caracteresDeFruta : List<Int> = listaDeFrutas.map{ fruta -> fruta.length}
    println(caracteresDeFruta)

    //FILTER
    println("\n\nFILTER")
    val listraFiltrada : List<Int> = caracteresDeFruta.filter{ caracteresFruta -> caracteresFruta > 5}
    println(listraFiltrada)
}
