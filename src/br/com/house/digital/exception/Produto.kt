package br.com.house.digital.exception

open class Produto(private var preco: Double, private var nome: String) {
    val precoProduto get() = preco
    val nomeProduto get() = nome
}