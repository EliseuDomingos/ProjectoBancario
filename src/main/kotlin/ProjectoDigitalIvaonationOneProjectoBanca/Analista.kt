package ProjectoDigitalIvaonationOneProjectoBanca

import java.math.BigDecimal

class Analista(
    nome: String,
    cpf: String,
    salario: Double
    ):Funcionario(nome, cpf, salario) {
    override fun calcAuxilio() = salario +(salario+0.1)
    }

