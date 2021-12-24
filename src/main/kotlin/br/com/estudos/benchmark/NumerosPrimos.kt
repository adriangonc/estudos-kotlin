package br.com.estudos.benchmark

import kotlin.system.measureTimeMillis
var contNumerosPrimos = 0
fun main() {
    var listaNumeros: MutableList<Int> = mutableListOf(0)

    for(i in 1..9999){
        listaNumeros.add(i)
    }

    val time = measureTimeMillis {
        listaNumeros.forEach { i ->
            numeroEPrimo(i)
        }
    }
    println("\nA verificação de ${listaNumeros.size} numeros demorou ${time} milisegundos.\nE encontrou ${contNumerosPrimos} numeros primos!")

}

//Número primo só e divisivel por 1 e por ele mesmo
//Número de divisores e somente 2
fun numeroEPrimo(numero: Int) {
    var numeroDivisores = 0

    if(numero > 2 && numero % 2 ==0){
        return
    }

    for(i in 1..numero){
        if(numero % i == 0){
            numeroDivisores ++
        }
    }

    if(numeroDivisores == 2){
        print("${numero} ")
        contNumerosPrimos ++
    }

}