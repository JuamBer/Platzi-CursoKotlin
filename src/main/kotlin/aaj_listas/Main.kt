package aaj_listas

fun main(args: Array<String>){
    //LISTA INMUTABLE
    println("\n\nLISTA INMUTABLE")
    val listaDeNombres = listOf("Juan","Enrique","Camila")
    println("listaDeNombres $listaDeNombres")

    //LISTA MUTABLE
    println("\n\nLISTA MUTABLE")
    val listaVacia = mutableListOf<String>()
    println("listaVacia $listaVacia")
    listaVacia.add("Pepe")
    listaVacia.add("Lopez")
    println("listaVacia $listaVacia")

    val valorUsandoGet = listaVacia.get(0)
    println("valorUsandoGet $valorUsandoGet")

    val valorUsandoOperador = listaVacia[0]
    println("valorUsandoOperador $valorUsandoOperador")

    val primerValor = listaDeNombres.firstOrNull()
    println("primerValor $primerValor")

    listaVacia.removeAt(0)
    println("listaVacia $listaVacia")


    listaVacia.add("Pepe")
    listaVacia.removeIf { caracteres -> caracteres.length > 3}
    println("listaVacia $listaVacia")


    //ARRAY
    println("\n\nARRAYS")
    val myArray = arrayOf(1,2,3,4)
    println("myArray $myArray")
    println("Array como lista ${myArray.toList()}")

    //SORT
    println("\n\nSORT")
    val numerosDeLoteria = listOf(11,22,43,56,78,66)
    println("numerosDeLoteria $numerosDeLoteria")
    val numerosSorted = numerosDeLoteria.sorted()
    println("numerosSorted $numerosSorted")

    //SORT DESCENDIENTE
    println("\n\nSORT DESCENDIENTE")
    val numerosDeLoteriaDescendientes = numerosDeLoteria.sortedDescending()
    println("numerosDeLoteriaDescendientes $numerosDeLoteriaDescendientes")

    //SORT ORTED BY
    println("\n\nSORTED BY")
    val ordenarPorMultiplos = numerosDeLoteriaDescendientes.sortedBy { num ->  num < 50 }
    println("ordenarPorMultiplos $ordenarPorMultiplos")

    //SHUFFLED
    println("\n\nSHUFFLED")
    val numerosAleatorios = numerosDeLoteriaDescendientes.shuffled()
    println("numerosAleatorios $numerosAleatorios")

    //REVERSE
    println("\n\nREVERSE")
    val numerosReverse = numerosDeLoteriaDescendientes.reversed()
    println("numerosReverse $numerosReverse")

    //MAP
    println("\n\nMAP")
    val mensajesNumeros = numerosDeLoteriaDescendientes.map{ num-> "Tu número de loteria es $num" }
    println("mensajesNumeros $mensajesNumeros")

    //FILTER
    println("\n\nFILTER")
    val numerosFilter= numerosDeLoteriaDescendientes.filter{ num-> num > 50}
    println("numerosFilter $numerosFilter")
}
