package Testes

import ProjectoDigitalIvaonationOneProjectoBanca.Analista
import ProjectoDigitalIvaonationOneProjectoBanca.Funcionario
import ProjectoDigitalIvaonationOneProjectoBanca.Pessoa

fun main(){
    // chamar a class Pessoa
    val funcionario1 = Analista("Eliseu","123456789", 160000.0)
    println(funcionario1.nome)
    println(funcionario1.cpf)
    println(funcionario1.salario)

    imprimirRelatorio(funcionario1)


}
// criação de uma função que recebe atributo funcionario, cujo seu tipo é o objecto Funcionario, ou seja a class Funcionario...
// Esta funcao por sua vez ira receber outra funcao chamada toString criada na classe Funcionario
fun imprimirRelatorio(funcionario: Funcionario) = print(funcionario.toString())
