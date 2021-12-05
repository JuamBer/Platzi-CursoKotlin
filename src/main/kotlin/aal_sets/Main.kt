package aal_sets

fun main(args: Array<String>){
    val vocalesRepetidas = setOf("a","e","i","o","u","i","o")
    println(vocalesRepetidas)

    val numerosFavoritos = mutableSetOf(1,2,3,4)
    numerosFavoritos.add(5)
    numerosFavoritos.add(5)
    println(numerosFavoritos)
    numerosFavoritos.remove(5)
    println(numerosFavoritos)

    val valorDelSet: Int? = numerosFavoritos.firstOrNull{ num -> num > 2}
    println("valorDelSet $valorDelSet")
}
