package aah_null_safety

fun main(args: Array<String>){
    var nombre : String? = null

    println("Longitud de nombre: "+nombre?.length)

    try {
        //throw NullPointerException("Referencia Nula")
        println("Longitud de nombre: "+nombre!!.length)
    }catch (exception: NullPointerException){
        println("Error")
    }finally {
        println("Error, cerrando aplicación")
    }

    val primerValor = 10
    val segundoValor = 0
    val result : Int = try {
        primerValor / segundoValor
    }catch (exception: Exception){
        0
    }
    println(result)

}
