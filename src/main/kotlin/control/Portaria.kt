package fastfood.control

import fastfood.business.ConvidadoBusiness
import fastfood.entity.Convite

class Portaria {

    private val convidadoBusiness = ConvidadoBusiness()

    init {
        println("Portaria inicializada.")
        println(controle())
    }

    private fun controle(): String {
        val name = Console.readString("Qual é o seu nome? ")
        val idade = Console.readInt("Qual é sua idade? ")
        if (!convidadoBusiness.maiorDeIdade(idade)) {
            return "Negado. Menores de idade não são permitidos."
        }
        val tipoConvite = Console.readString("Qual é o tipo de convite? ")
        if (!convidadoBusiness.tipoValido(tipoConvite)) {
            return "Negado. Convite inválido."
        }
        val codigo = Console.readString("Qual é o tipo de codigo? ")
        val convidado = Convite(tipoConvite, codigo, idade)
        if (!convidadoBusiness.convidadoValido(convidado)) {
            return "Negado. Convite inválido"
        }
        return "Seu nome é: " + name + " Sua Idade: "+ idade + " Seu número do convite é: " + codigo + " Welcome :),"
    }
}

fun portaria() {

    //val idade = readLine() // if (idade != null && idade != "") {
         //if (idade.toInt() < 18) {
    //          println("Negado. Menores de idade não são permitidos.")
    //         return
    //     }
    //}
    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        /*tipoConvite = tipoConvite.lowercase()

        // Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. Convite inválido.")
            return
        }*/
        print("Qual o código do convite? ")
        var codigo = readLine()
        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()
            //if (tipoConvite == "comum" && codigo.startsWith("xt")) {
              //  println("Welcome :)")
         //   } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
          //  ) {
            //    println("Welcome :)")
          //  } else {
             //   println("Negado. Convite inválido")
           // }
        }
    }
}


