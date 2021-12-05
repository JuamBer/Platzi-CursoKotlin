package aaj_listas

fun main(args: Array<String>){
    //LISTA INMUTABLE
    val listaDeNombres = listOf("Juan","Enrique","Camila")
    println("listaDeNombres $listaDeNombres")

    //LISTA MUTABLE
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
    val myArray = arrayOf(1,2,3,4)
    println("myArray $myArray")
    println("Array como lista ${myArray.toList()}")
}
