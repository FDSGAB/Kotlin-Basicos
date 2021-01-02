/*
Maps (dicionários do Python):
 */

val products = mapOf(//Lista de pares imutável
    "Apple" to "iOS",
    "Google" to "Android"
)

println(products)
products["Apple"]//Acessa um elemento com base em uma chave dada
products.isEmpty()//verifica se o map está vazio
products.size//verifica o tamanho do map

val userA = mutableMapOf(
    "name" to "Gabriel",
    "country" to "Brasil",
    "state" to "SP"
)

userA.put("country", "USA")//Muda o valor atribuido a uma chave
userA

var pairTeacher = "teacher" to "sim"//cria um par chave-elemento para um map
userA += pairTeacher//adiciona um par chave-elemento ao map
userA

userA.remove("teacher")//remove um par chave-elemento com base na chave
userA

for (chave in userA.keys){//percorre um map com base em suas chaves
    println(chave)
}

1.hashCode()//Devolve um número unico atribuido a um certo elemento
true.hashCode()
"country".hashCode()

/*
Sets(conjuntos):
 */

val otherNames = setOf("Tiago", "Joao", "Felipe", "Tiago")//cria um set, conjunto que não computa entradas duplicadas
otherNames

val array = arrayOf(1,2,3,4,3)//permite valores duplicados
println(mutableSetOf(*array))//transforma o array em um set e, consequentemente, apaga suas entradas duplicadas

val fromArray = mutableSetOf(*array)

fromArray.contains(3)//indentifica se o set contem um certo elemento
2 in fromArray// também identifica se o set contem um certo elemento

fromArray.add(5)//adiciona um elemento ao set
fromArray.remove(2)//remove um elemento do set
fromArray

/*
lambdas ou funçoes anônimas:
 */

//var calculatorLambda: (Int, Int) -> Int
var calculatorLambda = { a:Int, b:Int -> Int//cria uma função lambda anonima
    a+b
}

println(calculatorLambda(3,3))

val square: (Int) -> Int = {//outra maneira de criar uma função lambda
    it*it
}
println(square(5))

fun lambdaCalc (x:Int, y:Int, function: (Int, Int) ->Int){
    println(function(x,y))
}

lambdaCalc(2,3) {x,y ->
    x*y
}//Outra maneira de fazer uma função lambda

lambdaCalc(2,3, Int::plus)//chama uma função no lugar designado da função lambda

var lambda: () -> Unit ={//Ainda outra forma de lambda
    println("Hellooo man")
}
lambda()

var texts = listOf("ao","ai","wds","waae")

println(texts.sorted())//ordena em ordem crescente ou alfabetica
println(texts.sortedWith(compareBy {
    it.length//ordena de acordo com o tamanho da string
}))

array.forEach{
    println(it*it)
}//realiza uma ação para cada valor

println(array.filter{
    it>2
})//filtra um array com base em uma condição

println(array.map{
    it*0.8
})//transforma uma lista em outra seguindo as instruções do bloco de instruções

println(array.reduce{a, b->
    a+b
})//reduz uma lista a um unico valor seguindo as instruções fornecidas

println(array.fold(5){a,b ->
    a+b
})//faz a mesma coisa que a expressão de cima com um valor inicial fornecido que fará parte da soma















