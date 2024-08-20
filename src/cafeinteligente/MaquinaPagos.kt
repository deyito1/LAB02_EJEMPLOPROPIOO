package cafeinteligente

class MaquinaPagos(nombre: String) : DispositivoInteligente(nombre), Operable {
    override fun encender() {
        println("$nombre está encendida.")
    }

    override fun apagar() {
        println("$nombre está apagada.")
    }

    override fun operar() {
        println("$nombre está procesando el pago.")
    }
}
