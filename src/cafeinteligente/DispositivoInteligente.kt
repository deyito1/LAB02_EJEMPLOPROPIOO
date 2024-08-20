package cafeinteligente

abstract class DispositivoInteligente(val nombre: String) {
    abstract fun encender()
    abstract fun apagar()
}

class CafeteraInteligente(nombre: String) : DispositivoInteligente(nombre), Operable {
    override fun encender() {
        println("$nombre está encendida.")
    }

    override fun apagar() {
        println("$nombre está apagada.")
    }

    override fun operar() {
        println("$nombre está preparando el café.")
    }
}
