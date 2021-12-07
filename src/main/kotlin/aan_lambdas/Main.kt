package aam_funciones

fun main(args: Array<String>){
    val frase = "Hola"
    imprimirFrase(randomCase(frase))
    imprimirFrase(frase.randomCaseExtension())
    imprimirNombre(nombre = "Juan", apellido = "Sáez")
}

//FUNCIONES
fun randomCase(frase : String) : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if(resultadoAleatorio.rem(2) == 0){
        frase.uppercase()
    }else{
        frase.lowercase()
    }
}
//MÉTODOS
fun imprimirFrase(frase : String) : Unit{
    println("Tu frase es $frase")
}

//FUNCIONERS DE EXTENSIÓN
fun String.randomCaseExtension() : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if(resultadoAleatorio.rem(2) == 0){
        this.uppercase()
    }else{
        this.lowercase()
    }
}
//PARÁMETROS NOMBRADOS
fun imprimirNombre(nombre: String, segundoNombre: String = "", apellido: String){
    println("Mi nombre es $nombre $segundoNombre $apellido")
}