/*
Continuação de tipos de dados e classes:
 */
val byte: Byte = 1//transforma um valor em 1 byte ao inves de uma sequencia maior de 0s e 1s
val short: Short = 1//transforma um valor em 2 bytes
val int: Int = 1//4 bytes
val long: Long = 1//8 bytes

val float: Float = 1.0f // 1 byte, precisão de 6 dígitos
val double: Double = 1.0// 2 bytes, precisão de 15 dígitos

/*
Outros tipos de dado: Any, Unit (void do Java), Nothing:
 */
//Any: qualquer tipo de valor pode ser alocado na memoria
val numberAny: Any = 10
val textAny: Any = "10"

//Unit: função que não retorna nada
fun add4(): Unit{
    val result = 2+2
    println(result)
}
fun add(x: Int, y: Int): Int{
    val result = x + y
    return result
}
add(4,5)
add4()
/*
//Nothing: loop infinito que sempre retorna nada
fun forever(): Nothing{
    while(true) {
        Thread.sleep(1000)//Espera mil milissegundos (1s)
        println("oi")

    }
}
fun main(){
    forever()
}
*/

/*
Condicionais:
 */
val yes = true
val no = false

(1==2)//comparador de igualdade
(1!=2)//comparador de diferença
(1>2)//comparadores de magnitude, maior
(1<2)//menor
(1>=2)//maior igual
(1<=2)//menor igual

!(1!=2)//negação da comparação

val and = true && false//comparador lógico "e" (and)
println(and)
val or = true || false//comparador lógico "ou" (or)
println(or)

val zz = 0>1 && 1>0//comparando expressões
zz
val password = "123"
val correct = "1234"
password == correct
"barco"< "casa"//comparação por ordem alfabética
val age = 20
if (age>10){
    println("maior de idade")
} else{
    println("menor de idade")
}

val a = 30
val b = 20
val max = if (a>b) a else b
max

val bankAccount = 2000
val product = if (bankAccount>1900){
    "Iphone"
}   else if (bankAccount>1500){
    "Motorola"
}   else if (bankAccount > 1000){
    "Samsung"
}   else{
    "Sem dinheiro"
}
println(product)


var discount: Int = 0
if (bankAccount>1900){
    discount = 1900*10/100
}
val preço = bankAccount-discount

/*
Loops, laços:
 */

fun main(){//main é por onde o programa começa (igual o __init__ do python?)
    //forever()
    var sum = 1
    /*while (sum<1000){
        sum += 1
        println(sum)*///faz a mesma coisa que o de baixo
    do{
        if (sum==501)
            break//para o laço/loop
        println(sum)
        sum +=1
    } while (sum <=1000)
}
main()

/*
Ranges e contadores
 */

val range = 0..5//cria uma sequencia de numeros de 0 a 5
println(range)
val decrease = 5 downTo 0//range decrescente
println(decrease)
val rangeTil = 0 until 5//range de um numero até n-1

for(x in range) {//for - laço para um espectro de valores
    println(x)
}
range.forEach{
    println(it)// para cada elemento de range faz algo
}

var sum = 1
var lastSum = 0
repeat(10){
    val temp = sum//temp é uma variavel temporária
    sum += lastSum
    lastSum = temp
    println("sum $sum last $lastSum")//repete uma ação uma determinada quantidade de vezes
}

sum = 0
for (i in 0..32 step 2) {//cria um range indica de quanto em quanto ele será percorrido
    println(i)
}

sum = 0
/*for (y in 0 until 8) {//vai de um número até n-1
    //println(y)
    if (y%2==0)
        continue//vai para a proxima instancia do laço

    for (x in 0 until 8){
        sum += x*y
        if (x==y)
        println("x $x y $y")
    }
}*/
col@ for (y in 0 until 8) {//vai de um número até n-1


    row@ for (x in 0 until 8){
        sum += x*y
        if (x==y)
            continue@col
        println("x $x y $y")
    }
}

val user = "Samsung"
when(user) {//função que procura dar match sequencialmente até uma condição ser satisfeita
    "Samsung", "Motorola" -> println("Android")//vigula serve como um "ou"
    else -> println("iOS")
}

val number = 3
val numberToText = when(number) {
    0 -> "zero"
    1 -> "um"
    4 -> "quatro"
    else -> {
        println("desconhecido")
        "desconhecido"
    }
}

println(numberToText)

val hour = 9
val time = when(hour) {
    in 6..11 -> "Manhã"
    in 12..17 -> "Tarde"
    in 18..24 -> "Noite"
    else -> "Não definido"
}
println(time)

when{//não é recomendado usar o when dessa forma ("solto")
    hour in 9..18 -> println("trabalhando")
    else -> println("descansando")
}













