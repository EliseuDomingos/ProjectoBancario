package ProjectoDigitalIvaonationOneProjectoBanca

class ImprimirAuxilio {

    // classe com companion Object não tem metodo contrutor... ou seja não recebem propriedades... elas são instanciadas apartir da propria classe
    companion object {
        fun imprimirBonus(funcionario: Funcionario) = println(funcionario.toString())
    }
}