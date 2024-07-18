fun main() {
    val palabras = mutableListOf<String>()
    var agregarPalabra = true

    while (agregarPalabra) {
        println("Ingresa una palabra:")
        val palabra = readLine()

        if (palabra != null) {
            palabras.add(palabra)
        }

        println("¿Deseas agregar otra palabra?")
        println("1. Sí")
        println("2. No")
        val opcion = readLine()

        if (opcion == "2") {
            agregarPalabra = false
            val palindromas = contarPalindromas(palabras)
            val vocalesD = VocalesDistintas(palabras)
            val consonantesI = ConsonantesIniciales(palabras)

            println("Las palabras palíndromas son: $palindromas")
            println("Palabras con al menos 2 vocales distintas: $vocalesD")
            println("Palabras que inician con consonante: $consonantesI")
        }
    }
}

fun contarPalindromas(palabras: List<String>): Int {
    var contar = 0
    for (palabra in palabras){
        if(esPalindroma(palabra)){
            contar++
        }
    }
    return contar
}

fun esPalindroma(palabra: String): Boolean {
    return palabra == palabra.reversed()
}

fun VocalesDistintas(palabras: List<String>): Int {
    var contar = 0
    for (palabra in palabras){
        if (DosVocalesDistintas(palabra)){
            contar ++
        }
    }
    return contar
}

fun DosVocalesDistintas(palabra: String): Boolean {
    val vocales = "aeiouAEIOU"
    var count = 0
    var encontradas = mutableSetOf<Char>()

    for (char in palabra) {
        if (char.lowercaseChar() in vocales && char.lowercaseChar() !in encontradas) {
            encontradas.add(char.lowercaseChar())
            count++
        }
        if (count >= 2) {
            return true
        }
    }
    return false
}


fun ConsonantesIniciales(palabras: List<String>): Int {
    var contar = 0
    for (palabra in palabras){
        if (palabra.isNotEmpty() && palabra[0].lowercase() !in "aeiou" && palabra[0].isLetter()) {
            contar++
        }
    }
    return contar
    }

