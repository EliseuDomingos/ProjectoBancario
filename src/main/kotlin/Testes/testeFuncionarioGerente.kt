package Testes

import ProjectoDigitalIvaonationOneProjectoBanca.Gerente
import ProjectoDigitalIvaonationOneProjectoBanca.ImprimirAuxilio

fun main(){

    val maria = Gerente("Maria Ramos", "12345678", 30000.00)
    ImprimirAuxilio.imprimirBonus(maria)
}