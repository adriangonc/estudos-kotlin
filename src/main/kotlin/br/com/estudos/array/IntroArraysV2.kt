package br.com.array

fun main() {
    val salarios: DoubleArray = doubleArrayOf(1532.00, 1200.00, 3200.00, 7200.00)
    val aumento = 1.1

    for(indiceSalario in salarios.indices){
        salarios[indiceSalario] = salarios[indiceSalario] * aumento
    }

    println(salarios.contentToString())

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * aumento
    }

    println(salarios.contentToString())
}