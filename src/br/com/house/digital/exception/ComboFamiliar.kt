package br.com.house.digital.exception

class ComboFamiliar (private var precoPromocional: Double,
                     private var nome: String
) : Produto(precoPromocional, nome) {
    val listaCombos = mutableListOf<ComboSimples>()
    var precoCombo: Double = 0.0

    fun adicionarCombos(vararg combos: ComboSimples) {
        try {
            listaCombos.addAll(combos)
        } catch (ex: Exception) {
            println("Erro ao adicionar combos!")
        }

        listaCombos.forEach {
            this.precoCombo += it.precoCombo
        }
    }
}