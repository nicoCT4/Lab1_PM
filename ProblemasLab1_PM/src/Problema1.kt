fun main() {

    println("Ingrese el valor decimal")
    val numero = readLine()
    var valorNumero = numero?.toInt() ?:0
    var binario = ""

    while (valorNumero > 0) {
        val resultado = valorNumero % 2
        binario = resultado.toString() + binario
        valorNumero /= 2
    }

    println("El número binario es: $binario")

}

