package br.com.estudos.lista

import br.com.list.Livro

fun List<Livro?>.imprimeComMarcadores(){
    val joinString = this
        .filterNotNull()
        .joinToString(separator = "\n"){
        " - ${it?.titulo} de ${it?.autor} publicado em ${it?.anoPublicacao}"
    }
    println("### Lista de livros ### \n$joinString")
}