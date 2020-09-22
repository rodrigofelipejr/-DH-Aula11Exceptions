package br.com.house.digital.exception

fun main() {
    val carrinho1 = Carrinho()

    val produto1 = Produto(07.50, "Hamburguer")
    val produto2 = Produto(03.50, "Chips de Batata")
    val produto3 = Produto(10.50, "X-Bacon")
    val produto4 = Produto(12.50, "X-Egg")
    val produto5 = Produto(13.50, "Porção de Fritas")

    val comboSimples1 = ComboSimples(15.00, "Combo individual Infantil")
    val comboSimples2 = ComboSimples(18.00, "Combo individual Bacon")
    val comboSimples3 = ComboSimples(22.00, "Combo individual Egg+")

    val comboFamiliar1 = ComboFamiliar(35.00, "Combo Pai e Filho")
    val comboFamiliar2 = ComboFamiliar(50.00, "Combo Família+")

    comboSimples1.adicionarProdutos(produto1, produto5)
    comboSimples2.adicionarProdutos(produto3, produto5)
    comboSimples3.adicionarProdutos(produto2, produto4, produto5)

    comboFamiliar1.adicionarCombos(comboSimples1, comboSimples3)
    comboFamiliar2.adicionarCombos(comboSimples1, comboSimples2, comboSimples3)

    println("INÍCIO DAS COMPRAS")
    carrinho1.adicionarCombosFamiliares(comboFamiliar1)
    carrinho1.adicionarProdutos(produto2)
    carrinho1.adicionarCombosSimples(comboSimples3)

    carrinho1.exibirItens()
}