package br.com.array

fun main(){
    var maiorIdade = 0

    val idades: IntArray = intArrayOf(20, 11, 13, 16, 33)

    for(idade in idades){
        if(idade > maiorIdade){
            maiorIdade = idade
        }
    }

    var menorIdade = idades[0]
    idades.forEach { idade ->
        if(idade < menorIdade ){
            menorIdade = idade
        }
    }
    
    println("A maior idade e: " + maiorIdade)
    println("A menor idade e: " + menorIdade)

}