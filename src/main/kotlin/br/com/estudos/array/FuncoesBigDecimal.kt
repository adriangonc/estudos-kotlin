package br.com.array

import java.math.BigDecimal
import java.math.RoundingMode

fun calculaAumentoFuncionario(salario: BigDecimal, aumento: BigDecimal) =
    if (salario <= "5000.00".toBigDecimal()) {
        salario + "500.00".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

//vararg pode receber várias quantidades e valores
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { indice ->
        valores[indice].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce {acumulador, valor ->
        acumulador + valor //Em cada iteração a variável acumulador tera o valor somado
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()){
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}