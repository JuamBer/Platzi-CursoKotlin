package aao_high_order_functions

fun main(args: Array<String>){
    val largoValorInicial = superFunction(valorInicial = "Hola!", block = { valor ->
        valor.length
    })

    println(largoValorInicial)
    val lambda: () -> String = funcionInception(nombre = "Enrique")
    val valorLambda: String = lambda()
    println("valorLambda $valorLambda")
}

fun superFunction(valorInicial: String, block : (String) -> Int) : Int {
    return block(valorInicial)
}

fun funcionInception(nombre: String) : () -> String {
    return {
        "Hola desde la lambda $nombre"
    }
}