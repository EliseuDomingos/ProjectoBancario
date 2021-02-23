package ProjectoDigitalIvaonationOneProjectoBanca

class Pessoa {

    var nome: String = "Eliseu Domingos"
    var cpf:String = "12.45.78.26"
        private set // está linha impede com que fora dos escopo, as variaveis nome e cpf, ficassem inalterados...

    constructor() // criação de um metodo construtor
    
    // criação de função com atribuição dos atributos da classe
    fun pessoaInfo() = "$nome + $cpf"


}
fun main(){

    val pessoa1 = Pessoa()
    println(pessoa1.nome)
    println(pessoa1.cpf)

    println(pessoa1.pessoaInfo())

}