package fastfood.business

import fastfood.entity.Convite

class ConvidadoBusiness {
    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun maiorDeIdade(idade: Int) = idade > 18

    fun convidadoValido(convite: Convite) = when (convite.tipo) {
           "comum" -> convite.codigo.startsWith("xt")
           "premium", "luxo" -> convite.codigo.startsWith("xl")
           else -> false
    }
}
