package Testes

import ProjectoDigitalIvaonationOneProjectoBanca.Banc

fun main(){

    // testar as clsse Banc
    // chamar a função
    val bancoDigiOne = Banc("DigiOne", 1)
    println(bancoDigiOne.numero)
    println(bancoDigiOne.nome)

    val bancoDigiOne2 = bancoDigiOne.copy("DigiOne2", 2)
    println(bancoDigiOne2.numero)
    println(bancoDigiOne2.nome)

    println(bancoDigiOne2.info())

}