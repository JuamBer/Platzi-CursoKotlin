package aae_condicional

fun main(args: Array<String>){
    //val nombre = ""
    //val nombre = "Li"
    val nombre = "Maria"

    //IF ELSE
    if(nombre.isNotEmpty()){
        println("El tamaño de nombre es: ${nombre.length}")
    }else{
        println("La variable está vacía")
    }

    //IF ACORTADO
    if(nombre.isNotEmpty()) println("El tamaño de nombre es: ${nombre.length}") else println("La variable está vacía")

    //IF ASIGNANDO A VARIABLE
    val mensaje : String = if (nombre.length > 4){
        "Tu nombre es largo"
    }else{
        "Tu nombre es corto"
    }
    println(mensaje)

    //ELSE IF
    val mensaje2 : String = if (nombre.length > 4){
        "Tu nombre es largo"
    }else if(nombre.isEmpty()){
        "La variable está vacía"
    }else{
        "Tu nombre es corto"
    }

    println(mensaje2)
}
