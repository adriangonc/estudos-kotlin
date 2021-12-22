package br.com.array

fun main() {

    val idades:  IntArray = intArrayOf(13, 11, 16 ,18, 33)
    val maiorIdade = idades.maxOrNull()
    println(maiorIdade)

    val menorIdade = idades.minOrNull()
    println(menorIdade)

    val mediaIdade = idades.average()
    println(mediaIdade)

    //Verifica se todos os elementos satisfazem a condição
    val todosMaiores = idades.all { it > 18 }
    println(todosMaiores)

    //Verifica se algum dos elementos satisfaz a condição
    val algumMaior = idades.any { it >= 18 }
    println(algumMaior)
    
    //Filtrar somente registros que atendem condição
    val idadesMaiores = idades.filter { it >= 18}
    println(idadesMaiores)

    //Encontra algum valor
    val busca = idades.find {it == 33}
    println(busca)

}