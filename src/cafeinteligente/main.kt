package cafeinteligente

fun main() {
    val cafetera = CafeteraInteligente("Cafetera Inteligente")
    val maquinaPagos = MaquinaPagos("Máquina de Pagos")

    maquinaPagos.encender()
    maquinaPagos.operar()
    maquinaPagos.apagar()

    cafetera.encender()
    cafetera.operar()
    cafetera.apagar()
}
