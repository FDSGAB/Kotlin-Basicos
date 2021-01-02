/*
Funções
 */
fun printHello(){
    println("Hello")
}
printHello()

fun add(x:Int,y:Int){//parametros (dados pedidos)
    println(x+y)
}

add(2,3)//argumentos (input de dados)
add(7,9)
add(x=2,y=3)//pode se especificar os argumentos

fun discount(x:Int,percent:Int=10) {
    println(x-(x*percent/100))
}

discount(100)//não é necessario declarar o segundo argumento, mas pode-se fazê-lo e ele sera substituido
discount(percent=50,x=100)//pode-se alterar a ordem dos argumentos desde que eles sejam declarados totalmente

fun multi(x:Int,y:Int) : Int {// :Int especifica o tipo do retorno da função
    return x*y
}

fun divide (x:Int, y:Int) : Int {
    return x/y
}

println(multi(3,6))

fun multiplyDivide(x:Int, y:Int) : Pair<Int, Int> {//necessário especificar o retorno nesse caso
    return Pair(x*y,x/y)
}

println(multiplyDivide(10,5))

//fun hasta(x: Int, y: Int) = return Pair(x * y, x / y) essa sintaxe nao funcionou

/*
Funções com o mesmo nome (sobrecarga de método)
 */

fun getValue(value: String) : String {
    return value
}

fun getValue(value: Int, def: Int = 2) : Int {//basta definir outro parametro pra função ser diferenciavel e funcionar
    return value
}
getValue("sdsada")
getValue(5)

/*
Manipulando funções, programação funcional:
 */
var funSum = ::add//armazena uma função dentro de uma variável
funSum(2,3)

fun genericCalc(function: (Int,Int) -> Int, x:Int, y:Int) {
    println(function(x,y))
}

genericCalc(::divide,3, 2)
genericCalc(::multi,4,3)

/*
Métodos que o Kotlin fornece para se evitar erros/crashes:
 */
var errorCode = 0
//null - ausencia de valor em uma vairavel
var errCode: Int? = null// o "?" permite que o null seja atribuido à variavel
var msg= ""
var text: String? = null
if (text !=null) {
    msg = text + "outro valor"
}
//var msg = text!! + "outro valor"//desencapsula a vairavel "!!"
//println(" $msg mundo")
var texto = "Hello"
println(texto.length.plus(10))//lenght da o tamanho da palavra e plus soma ao valor
//lenght não acessa variaveis nulas
println(text?.length?.plus(10))//com o "?" o kotlin verifica se é possivel tirar o lenght, então é possivel q a variavel seja nula

text?.let{
    println(it.length.plus(1))
}// let descompacta a variavel (desencapsula)

println(text?.length?:0)//verifica se o primeiro retorna, senão imprime o segundo argumento depois do ":"

/*
Coleções (arrays (tamanho fixo) e listas(tamanho dinamico)):
 */

//arrays
val numbers = arrayOf(1,2,3)//cria um array, valores constantes e imutaveis
println(numbers[1])//acessa o segundo valor do array, a contagem começa em 0

val ten = Array(5, { 10 })//cria um array e os parametros especificam o tamanho e o valor q sera colocado em cad aindice do array
println(ten[0])
val abuble = Array(5) {
    10
}//faz a mesma coisa que o de cima, sintaxe diferente mais apropriada para blocos de instruções
println(abuble[3])


val numbersInt = intArrayOf(1,2,3)//tipos primitivos ocupam menos memoria

//listas
var texts = listOf("Hello", "World", "Hamburger")//Cria uma lista, valores e tamanhos dinamicos
println(texts[0])

val names = mutableListOf<String>()//Cria uma lista mutável de strings
names.add("Joan")//Adiciona um elemento a uma lista
names.add("Rosbife")
names.add("Adler")
names.add("Hey")
println(names)
names += "Só"//adiciona um elemento a uma lista
println(names)
names.isEmpty()//Retorna verdadeiro ou falso para saber se a lista contem algum elemento
names.size//retorna o tamanho da lista
names.first()//busca o primeiro elemento da lista
names.last()//busca o ultimo elemento da lista
names.min()//busca o menor valor da lista, para strings se usa a ordem alfabetica
names.joinToString("-")//retorna uma string com todos os elementos separados pelo argumento especificado
names.slice(0..2)//retorna uma sublista, os indices selecionados sao especificados pelo range
names.contains("Veja")//verifica se o elemento especificado esta presente na lista
names.remove("Só")//Remove o elemento indicado da lista, retorna um booleano
//names.remove(0) remove um elemento pelo índice
names.sort()//ordena a lista
println(names)

for (name in names){//para cada elemento na lista, realiza-se uma ação
    println(name)
}

for((index,name)in names.withIndex()) {//imprime o indice e o elemento correspondente da lista
    println("$index, $name")
}

var listOfNullable: List<Int?> = listOf(1, 2, null, 4)//lista que aceita valores nulos
var listOfNullable: List<Int>? = listOf(1, 2, 3, 4)//A lista em si pode ser nula, não seus elementos











