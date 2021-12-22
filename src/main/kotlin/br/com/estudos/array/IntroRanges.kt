package br.com.array

fun main() {

    val serie = 1..1532

    serie.forEach {s ->
        print("$s ")
    }

    val countDown = 100 downTo 0L

    countDown.forEach {count ->
        println(count)
    }

    val somentePares = 0..10 step 2
    somentePares.forEach {p ->
        print("$p ")
    }

}