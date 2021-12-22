package br.com.estudos.lista

import br.com.list.Livro

public fun main() {
    val livros: MutableList<Livro> = populaLivros()

    livros.add(
        Livro(titulo = "A arte da guerra",
        autor = "Sun Tzu",
        anoPublicacao = 0)
    )

    livros.imprimeComMarcadores()

    val listaLivrosOrdenadosPorAno: List<Livro> = livros.sorted()
    listaLivrosOrdenadosPorAno.imprimeComMarcadores()

    val livrosPorTitulo: List<Livro> = livros.sortedBy { it.titulo }
    livrosPorTitulo.imprimeComMarcadores()

    val titulos: List<String> = listaLivrosOrdenadosPorAno
        .filter { it.autor.startsWith( "S")}.map {it.titulo}

    println(titulos)

}

private fun populaLivros(): MutableList<Livro> {
    val livroPassaroPintado = Livro(
        titulo = "O pássaro pintado",
        autor = "Jerzy Kosi?ski",
        anoPublicacao = 1965
    )

    val livroRevival = Livro(
        titulo = "Revival",
        autor = "Stephen King",
        anoPublicacao = 2014,
        editora = "Suma"
    )

    val livroOOitavoPassageiro = Livro(
        titulo = "O Oitavo Passageiro",
        autor = "Alan Dean Foster",
        anoPublicacao = 1987
    )

    val livroGameOfThrones = Livro(
        titulo = "A Guerra dos Tronos",
        autor = "George R. R. Martin",
        anoPublicacao = 1996
    )

    val livros: MutableList<Livro> = mutableListOf(
        livroPassaroPintado,
        livroRevival,
        livroOOitavoPassageiro,
        livroGameOfThrones
    )
    return livros
}

val listaDeLivros = populaLivros()

val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
    Livro(
        titulo = "O pássaro pintado",
        autor = "Jerzy Kosi?ski",
        anoPublicacao = 1965
    ),
    null,
    Livro(
        titulo = "Revival",
        autor = "Stephen King",
        anoPublicacao = 2014,
        editora = "Suma"
    ),
    null,
    Livro(
        titulo = "O Oitavo Passageiro",
        autor = "Alan Dean Foster",
        anoPublicacao = 1987
    ),

    Livro(
        titulo = "A Guerra dos Tronos",
        autor = "George R. R. Martin",
        anoPublicacao = 1996
    )

)


