package ProjectoDigitalIvaonationOneProjectoBanca

class Gerente(nome: String, cpf: String, salario: Double):Funcionario(nome, cpf, salario) {

    override fun calcAuxilio() = salario + (salario+0.4)

}
