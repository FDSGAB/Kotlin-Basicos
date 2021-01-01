import kotlin.math.* //importa toda a biblioteca
import kotlin.math.sqrt //importa parte da biblioteca

/*
Teoricamente: import kotlin.math.*
importa a biblioteca inteira
 */

//Comentário linha
/*
Comentários
 */
/*
Operações básicas e prints
 */
println("Texto") //print line: imprime string (texto)
println(122333) //print line: imprime números

3 + 2 //soma
3 - 2 //subtração
3 * 2 //multiplicação
3 / 2 //divisão de números inteiros (Int)
3 % 2 //divisão de resto (módulo)
3.0 / 2.0 //divisão de números reais (Doubles)

/*
Formatando resultados %.4f para 4 digitos decimais
%.2f para dois dígitos decimais e assim por diante
 */

"%.4f".format(29.0/10.0)//formatando

/*
Declarando e chamando funções
 */

fun main(){
    println("Hello, World!")
    //constantes não podem existir dentro de funções criadas
}

main()//chama a função

/*
Função shift right (divide na metade um número)
ou shift left (dobra um número)
são funções que mudam a posição do número (dos bits)
na memória do computador
 */

8 shl 1
8 shr 1
7 shl 1

/*
Operações matemáticas mais avançadas necessitam de
pacotes. Importando pacotes (kotlin.math no caso):
 */

sqrt(2.00)
sin(90* PI)
max(2,3)
min(4, 2)

/*
Declaração de constantes e variáveis
(val=imutável, var=mutável):
 */

val x = 3 //Atribui um valor constante para a variavel x
//x = 100 retorna erro pois val x torna x uma constante
val pi = 3.141592//Double
val y: Float = 3.141592f//Float
/*
const val z = 3.14, somente permitida em objetos
(ou na parte mais superior do código???)
 */

var z = 300//atribui um valor variável a uma variável
//z=100 é permitido, pois o valor pode mudar
z = 1
println(z)
z=1_000_000//usa o '_' para separar casas pra n°s grandes
println(z)

z += 1//soma 1 ao valor da variável e armazena na variável
println(z)
z -= 1//subtrai 1 da variavel, analogo ao comando acima
println(z)

var count = 10
count *= 2//multiplica a variavel por dois e armazena na variavel
println(count)

/*
Tipos de dados:
 */

val text = "Hello, World!"//String (Frases, letras, caracteres, símbolos)
val rate: Double = 19.5//Double (número decimal)
val hours: Int = 10//Int (número inteiro)
val total = rate*hours
println(total)

'c'.toInt()//transforma um caracter em um número (unicode)

val a = 99
a.toChar()//transforma um número em um caracter (unicode)

var texto: String = "Code"

"aiaiai" + " uiuiui"//concatena(junta) duas strings

"Hello $a Gary"//$variavel transforma um numero inteiro em um numero string
"Hello ${a.toChar()} Gary"//extensão das funções vistas

"Preço é: ${10.0/3.0}"//${} executa uma operação dentro das chaves

val texts = """
    HAHAHAHA
    multiplas linhas
    YEAAHHHHHh
""".trimIndent()//cria texto em multiplas linhas

println(texts)

val coordinates =  Pair(2.3,3)//Aceita um par de dados que podem ser diferentes Ex: Int e String
println(coordinates)

coordinates.first//acessa o primeiro dado do par
coordinates.second//acessa o segundo dado do par

val coord = 2 to 3//cria um par que nem o pair
coord

/*
Era pra esses comandos funcionarem:
val (x1,y1) = coord
println(x1)

val (wer,_) = coord//pega somente o primeiro parametro e descarta o segundo
println(wer)
*/









