// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class Usuario(val nome: String, val age: Int, val id: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario): Boolean {
        if(inscritos.contains(usuario)){
            println("Usuario $usuario já está matriculado")
            return false
        }
        inscritos.add(usuario)
        println("Matriculando $usuario")
        return true
    }

    fun getDuracaoTotal(): Int {
        var duracaoTotal = 0
        conteudos.forEach {
            duracaoTotal += it.duracao
        }
        return duracaoTotal
    }

    fun listarInscritos(): List<Usuario> {
        return inscritos
    }

    fun isInscrito(usuario: Usuario): Boolean {
        return inscritos.contains(usuario)
    }
}

fun main() {
   val user1 = Usuario("Bruno", 35, 1)
   val user2 = Usuario("Miria", 36, 2)
   val conteudoEducacional = ConteudoEducacional("Tipos de classes em Kotlin", 120, Nivel.AVANÇADO)
   val conteudoEducacional2 = ConteudoEducacional("Tipos de classes em Kotlin2", 60, Nivel.INTERMEDIARIO)
   val conteudos = mutableListOf<ConteudoEducacional>()
   conteudos.add(conteudoEducacional)
   conteudos.add(conteudoEducacional2)
   
	val formacao1 = Formacao("Kotlin", conteudos, Nivel.AVANÇADO)
   
    formacao1.matricular(user1)
    formacao1.matricular(user2)
    formacao1.matricular(user1)
    println(formacao1.listarInscritos())
    println(formacao1.getDuracaoTotal())
    println(formacao1.isInscrito(user1))
    println(formacao1.isInscrito(user2))
}