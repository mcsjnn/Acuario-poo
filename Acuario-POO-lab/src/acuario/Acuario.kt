package acuario

open class Acuario (open var largo: Int = 100, open var ancho: Int = 20, open var alto: Int = 40) {

    // Propiedades
    open var volumen: Int
        get() = ancho * alto * largo / 1000  // 1000 cm^3 = 1 l
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }

    open val forma = "rectángulo"

    open var agua: Double = 0.0
        get() = volumen * 0.9

    // Bloques init
    init {
        println("inicializando acuario")
    }

    init {
        // 1 litro = 1000 cm^3
        println("Volumen: ${volumen} l")
    }

    // Método para imprimir el tamaño
    fun imprimirTamano() {
        println(forma)
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm ")
        println("Volumen: $volumen l Agua: $agua l (${agua/volumen*100.0}% lleno)")
    }

    // Constructor secundario
    constructor(numeroDePeces: Int) : this() {
        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }
}
