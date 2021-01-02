/*
Objetos e programação orientada a objetos:
 */

//Cria uma classe e define os parametros a serem recebidos
class User(var name: String, var lastName: String, var password: String){
    //criando mais instruções e funções para uma classe
    val fullName
        get() = "$name $lastName"//quando a variavel de cima é chamada ele pega a informação atribuida ao get()
}
val joao = User("João", "Maria", "abc")//atribui uma classe a uma variavel, criando um objeto
println(joao.name)//posivel chamar os argumentos dados ao objeto com ."argumento", nesse caso .name
println(joao.fullName)//pega a variavel criada dentro da classe do objeto
val ana = User("Ana", "Maria", "abc")//cria outro objeto a partir da mesma classe
val joao2 = joao
joao.password = "123"//altera a referencia de um dos argumentos do objeto, no caso: password
println(joao2.password)//mudada a referencia do objeto, muda o password para ambos
println(joao.password)

println(joao===joao2)//pergunta se dois objetos estão utilizando o mesmo espaço na memória, retornando o booleano correspondente

/*
Data class (bin do java):
 */

class Product(var name: String, var price: Double){
    override fun equals(other: Any?): Boolean {//verifica se o objeto atual é igual a outo, se tem a mesma referencia
        if (this===other)//"this" referencia o proprio objeto
            return true
        if (other=== null)
            return false

        if (javaClass != other.javaClass)
            return false
        val obj = other as Product

        if (name!=obj.name)
            return false

        if (price != obj.price)
            return false

        return true
    }

    override fun toString(): String {//transforma o objeto em uma string para visualização
        return "Product is (name=$name, price=$price)"
    }
}

var iPhone = Product("iPhone", 2000.0)
var iPhone2 = Product("iPhone", 2000.0)
println(iPhone)
println(iPhone==iPhone2)//compara as propriedades dos objetos

data class Product(var name: String, var price: Double){//gera todo o bloco de instruções q foi feito na mão para o class Product: equals, toString etc
}
var iPhone3 = Product("iPhone", 2000.0)
var iPhone4 = Product("iPhone", 2000.0)
println(iPhone3)
println(iPhone3==iPhone4)

/*
Destruindo propriedades:
val (name, price) = iPhone
println(name)
println(price)
*/

/*
Criando objetos anonimos:
 */

object Session {//cria um objeto anonimo
    var name = "Hello"
}

object Products {
    val allProducts = mutableListOf<Products>()

    fun addProduct(p: Product){
        allProducts.add(p)//erro
    }
}
Products.addProduct(3)
Products.addProduct(iPhone4)

Products.allProducts.forEach{
    println(it.name)//erro
}
