package aac_tipos_de_datos

fun main(args: Array<String>){
    //val boolean : Boolean = true;
    val boolean = true;
    println(boolean)
    //val numero : Int = 300;
    val numero = 300;
    println(numero)
    //val long1 : Long = 300000000;
    val long1 = 300000000;
    //val long2 : Long = 3;
    val long2 = 3L;
    println(long1)
    println(long2)
    //val double : Double = 2.7182;
    val double = 2.7182;
    println(double)
    //val float1 : Float = 1.1;
    val float1 = 1.1;
    //val float2 : Float = 1.1;
    val float2 = 1.1f;
    println(float1)
    println(float2)
    val primerValor = 20
    val segundoValor = 10
    //val tercerValor = primerValor.minus(segundoValor)
    val tercerValor = primerValor - segundoValor
    println(tercerValor)

    val nombre = "Juan"
    val apellido = "Sáez"
    val nombreCompleto = nombre + " " + apellido
    println(nombreCompleto)

    val otroNombreCompleto = "Mi nombre es $nombre $apellido"
    println(otroNombreCompleto)
}
