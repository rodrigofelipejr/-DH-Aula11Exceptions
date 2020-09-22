package br.com.house.digital.exception

class ComboSimples(
    private var precoPromocional: Double,
    private var nome: String,
) : Produto(precoPromocional, nome) {
    val listaProdutos = mutableListOf<Produto>()
    var precoCombo: Double = 0.0

    fun adicionarProdutos(vararg produtos: Produto, precoCombo: Double) {
        try {
            listaProdutos.addAll(produtos)
        } catch (ex: Exception) {
            println("Adicione uma lista de Produtos!!!")
        }

        listaProdutos.forEach {
            this.precoCombo += it.precoProduto
        }

    }


}