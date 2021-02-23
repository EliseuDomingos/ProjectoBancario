package Testes

import ProjectoDigitalIvaonationOneProjectoBanca.ClienteTipo

fun main(){

    // iterar o a Enum Cliente Tipo com ForEach e imprimir o valor e chave na tela
    ClienteTipo.values().iterator().forEach { elemento->
        println("${elemento.name} - ${elemento.descrico}")
    }

    ClienteTipo.values().iterator().forEach {
        println("${it.name} - ${it.descrico}") }

    // atribuir o valor de Ciente tipo pj a uma variavel
    val pj = ClienteTipo.pj
    println("${pj.name} - ${pj.descrico}")

    val pf = ClienteTipo.pf
    println("${pf.name} - ${pf.descrico}")


}
