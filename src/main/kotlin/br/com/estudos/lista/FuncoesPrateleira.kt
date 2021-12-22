package br.com.list

import br.com.estudos.lista.imprimeComMarcadores
import br.com.estudos.lista.listaDeLivros

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val livrosPorAutor = prateleira.organizarPorAutor()
    val livrosPorAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    livrosPorAutor.imprimeComMarcadores()
    livrosPorAnoPublicacao.imprimeComMarcadores()
}