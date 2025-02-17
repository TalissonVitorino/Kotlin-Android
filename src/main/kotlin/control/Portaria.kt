package fastfood.control

import fastfood.business.ConvidadoBusiness
import fastfood.entity.Convidado

class Portaria {

    private val convidadoBusiness = ConvidadoBusiness()

    init {
        println("Portaria inicializada.")
        println(controle())
    }

    private fun controle(): String {
        val name = Console.readString("Qual é o seu nome? ")
        val idade = Console.readInt("Qual é sua idade? ")
        val convidado = Convidado(idade = idade)

        if (!convidadoBusiness.maiorDeIdade(convidado.idade)) {
            return "Negado. Menores de idade não são permitidos."
        }
        convidado.tipo = Console.readString("Qual é o tipo de convite? ")
        if (!convidadoBusiness.tipoValido(convidado.tipo)) {
            return "Negado. Convite inválido."
        }
        convidado.codigo = Console.readString("Qual é o tipo de codigo? ")

        if (!convidadoBusiness.convidadoValido(convidado)) {
            return "Negado. Convite inválido"
        }
        return "Seu nome é: " + name + " Sua Idade: " + idade + " Welcome :),"
    }
}