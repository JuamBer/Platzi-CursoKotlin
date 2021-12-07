package aan_lambdas

fun main(args: Array<String>){
    val myLambdaIt : (String) -> Int = {
        it.length
    }

    val myLambda : (String) -> Int = {
        valor -> valor.length
    }

    val lambdaEjecutada = myLambda("Casa")
    println("lambdaEjecutada $lambdaEjecutada")

    val saludos = listOf("Hello","Hola","Ciao")

    val longitudDeSaludosMap = saludos.map{
        valor -> valor.length
    }
    val longitudDeSaludosLambda = saludos.map(myLambda)

    println("longitudDeSaludosMap $longitudDeSaludosMap")
    println("longitudDeSaludosLambda $longitudDeSaludosLambda")
}
