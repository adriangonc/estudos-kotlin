package br.com.estudos.array

import br.com.array.bigDecimalArrayOf
import br.com.array.calculaAumentoFuncionario
import br.com.array.media
import br.com.array.somatoria
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    val salarios = bigDecimalArrayOf("1000.00", "1532.00", "4800.00", "7200.00", "10000.00")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario ->
            calculaAumentoFuncionario(salario, aumento)
        }
        .toTypedArray()
    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto inicial: $gastoInicial")

    val meses = 12.toBigDecimal()
    val gastoAnual = salariosComAumento.fold(gastoInicial) {acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto anual: $gastoAnual")

    val mediaMaioresSalarios = salariosComAumento.sorted().takeLast(3).toTypedArray().media()
    println("Média dos tres maiores salários: $mediaMaioresSalarios")

    val mediaMenoresSalarios = salariosComAumento.sorted().take(3).toTypedArray().media()
    println("Média dos tres menores salários: $mediaMenoresSalarios")
}
