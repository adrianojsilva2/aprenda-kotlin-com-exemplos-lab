// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
/*
enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}




// segundo codigo
enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class Usuario(val nome: String, val age: Int, val id: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
//         TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

// fun main() {
//     TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//     TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
// }
// 
fun main() {
   val user1 = Usuario("Bruno", 35, 1)
   val user2 = Usuario("Miria", 36, 2)
   val conteudoEducacional = ConteudoEducacional("Tipos de classes em Kotlin", 120)
   val conteudoEducacional2 = ConteudoEducacional("Tipos de classes em Kotlin2", 60)
   val conteudos = mutableListOf<ConteudoEducacional>()
   conteudos.add(conteudoEducacional)
   conteudos.add(conteudoEducacional2)
   
	val formacao1 = Formacao("Kotlin", conteudos)
    
    formacao1.matricular(user1)
    formacao1.matricular(user2)
    
   	println(formacao1.inscritos)
  
}
*/


//terceiro codigo enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(vararg nome: String) {

    }

class ConteudoEducacional(vararg nome: String, var duracao: Any)


data class Formacao(var nome: Usuario, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>(nome)

    fun matricular(usuario: Usuario) {

        inscritos.add(usuario)
    }



    fun mostrarinscritos() {
        inscritos.forEach { println(it) }

    }
}

fun main() {
    val content = listOf(ConteudoEducacional("Kotlin Experience", duracao = "40 Horas"))

    val users = Usuario("Victor Hugo","Joelma dos Santos", "Alexandre")


    val formacao = Formacao(users, content)
    formacao.matricular(users)
    val inscr = (formacao.inscritos)

    formacao.mostrarinscritos()


}