package aak_maps

fun main(args: Array<String>){

    //MAPAS INMUTABLES
    val edadDeSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadDeSuperHeroes)

    //MAPAS MUTABLES
    val edadDeSuperHeroesMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadDeSuperHeroesMutable)

    edadDeSuperHeroesMutable.put("Wolverine", 45)
    println(edadDeSuperHeroesMutable)

    edadDeSuperHeroesMutable["Storm"] = 30
    println(edadDeSuperHeroesMutable)

    val edadIronman = edadDeSuperHeroesMutable["Ironman"]
    println("edadIronman $edadIronman")

    edadDeSuperHeroesMutable.remove("Wolverine")
    println(edadDeSuperHeroesMutable)

    println(edadDeSuperHeroesMutable.keys)
    println(edadDeSuperHeroesMutable.values)
}
