package aab_variables

//CONSTANTES DECLARA EN TIEMPO DE COMPILACIÓN
const val PI = 3.1416

fun main(args: Array<String>){
    //VARIABLE DE LECTURA Y ESCRITURA
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)

    //VARIABLE DE SOLO LECTURA DECLARADA EN TIEMPO DE EJECUCIÓN
    val nombre = "Maria"
    println(nombre)
    println(PI)
}
