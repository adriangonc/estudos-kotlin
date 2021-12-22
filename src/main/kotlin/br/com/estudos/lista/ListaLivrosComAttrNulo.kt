package br.com.estudos.lista

fun main(){
    listaDeLivros.groupBy{ it.editora ?: "Editora desconhecida" }
        .forEach { (editora: String?, livros) ->
        print("\n$editora: ${livros.joinToString { it.titulo }}")
    }
}