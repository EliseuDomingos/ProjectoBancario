package ProjectoDigitalIvaonationOneProjectoBanca

class Pessoa {

    var nome: String = "Eliseu Domingos"
    var cpf:String = "12.45.78.26"
        private set // está linha impede com que fora dos escopo, as variaveis nome e cpf, ficassem inalterados...



}
fun main(){

    val pessoa1 = Pessoa()
    println(pessoa1.nome)
    println(pessoa1.cpf)
}