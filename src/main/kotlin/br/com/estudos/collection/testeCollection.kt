fun main() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salva("Adriano")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados.toList() //Retorna uma cópia da lista, e não a própria mutable list

    fun salva(nome: String){
        dados.add(nome)
    }
    companion object {
        private val dados = mutableListOf<String>()
    }
}
fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Adriano",
        "Sara",
        "Gui",
        "Maria",
        "Ana"
    )
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")
}