import kotlin.properties.Delegates

/*
Objetos anonimos continuacao:
 */

object Keys {//Acessar chaves de JSON
    const val ID = "id"
    const val NAME = "name"
}

/*
Companion objects
 */

class Button private constructor(val id: Int, color: Int){//cores são representadas por numeros hexadecimais
    companion object{//cria uma função compartilhada por todas as instancias da classe
        var currentId = 0
        fun newButton(color: Int) : Button {
            currentId += 1
            return Button(currentId,color)
        }
    }
}

val blue = Button.newButton(255)
println(blue.id)
val yellow = Button.newButton(0)
println(yellow.id)

interface OnClickListener {//objeto anonimo para interface
    fun onClick()//touch rapido
    fun onLongClick()//touch longo (segurar um botao por exemplo)
}

val listener = object : OnClickListener {
    override fun onClick() {
    }
    override fun onLongClick() {
    }
}

/*
Propriedades
 */

class Screen {//objeto anonimo
    var top = 0
    var left = 0
    var right: Int
    var bottom : Int

    init {//executa assim que o objeto é criado
        right = 10
        bottom = 20
    }
}

class Converter(var real: Double) {
    var dolar: Double
        get() {
            return real / 3.5
        }
        set(value) {
            real = value*3.5
        }
}

val converter = Converter(3.5)
println(converter.dolar)
converter.dolar = 10.0
println(converter.real)

class Level(val id: Int, var boss: String) {
    companion object {
       @JvmStatic var highestLevel = 1//sintaxe de java
    }

}

val chefao = Level(1,"Bowser")
println(Level.highestLevel)

/*
Utilizações mais complexas:
 */
class Achievements(val id: Int) {
    companion object {
        var level = 1
    }
    var buy: Boolean by Delegates.observable(false){
        _, old, new ->
        if (new && id > level) {
            level = id
        }
        println ("$old - $new")
    }
}

val act1 = Achievements(1)
val act2 = Achievements(2)
println(Achievements.level)
act2.buy = true
println(Achievements.level)

class DB{
    companion object{
        const val maxUser = 10
    }
    var current by Delegates.vetoable(0){
        _,_, new ->
        new <= maxUser
    }
}

val db = DB()
db.current = 3
println(db.current)

class Window(val scale: Int){
    val height: Double by lazy{//Cria um delay no processo e so chama uma funcao quando é necessaria
        400.0*scale
    }

    val width: Double
        get() = height / 16 / 9
}

val w = Window(2)
println(w.width)


class Color {
    lateinit var value: String//variavel sera inicializada no futuro, semelhante ao lazy
}

/*
Extensões
 */
/*
val Window.size: Double
    get() height * width

val otherWindow = Window(2)
println(otherWindow.size)
*/
/*
fun String.firstChar() : String {
    return this.first()
}
*/
fun String.startsUppercase() : Boolean {
    return this.first().isUpperCase()
}

class Maths{
    companion object {
        fun factorial(number: Int) : Int {
            return (1..number).fold(1) {a, b ->a*b}
        }
    }
}

Maths.factorial(5)























