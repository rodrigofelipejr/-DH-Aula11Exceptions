package br.com.house.digital.exception

class ComboSimples(private var precoPromocional: Double,
                   private var nome: String) : Produto(precoPromocional, nome) {
    val listaProdutos = mutableListOf<Produto>()
    var precoCombo: Double = 0.0

    fun adicionarProdutos(vararg produtos: Produto) {
        try {
            listaProdutos.addAll(produtos)
        } catch (ex: Exception) {
            println("Erro ao adicionar combos!")
        }

        listaProdutos.forEach {
            this.precoCombo += it.precoProduto
        }

    }
}