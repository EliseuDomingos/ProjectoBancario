package ProjectoDigitalIvaonationOneProjectoBanca

// Criação de uma dataClasse
data class Banc(

    // propriedades da dataClasse
    val nome:String,
    val numero:Int
){
    // criação de metodo e atribuir as propriedades da classe na função
    fun info() = "$numero + $nome"
}
