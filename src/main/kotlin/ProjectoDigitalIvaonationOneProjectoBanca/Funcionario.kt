package ProjectoDigitalIvaonationOneProjectoBanca

import java.math.BigDecimal

abstract class Funcionario(
      nome:String,
      cpf: String,
      val salario:Double
):Pessoa(nome, cpf) {
    protected abstract fun calcAuxilio():Double // este metodo protected fará com que somente está classe e suas filhas usem est funcao

    // Criação de uma funcao toString ... que será usada nos outras classes para dar uma impressao vais formatada
    override fun toString(): String = """
        Nome: $nome
        cpf: $cpf
        Salario: $salario
        Bonus: ${calcAuxilio()}
    """.trimIndent()
}