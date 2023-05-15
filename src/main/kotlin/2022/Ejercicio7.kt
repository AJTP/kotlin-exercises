package `2022`
/*
 * 	-- Ejercicio7: Contando Palabras --
 * 	Esta función permite contar cuantas veces se repite cada palabra de un texto y muestra el recuento final
 *  Los signos de puntuación no forman parte de una palabra
 *  No debe ser sensible a mayúsculas
 */

fun main() {
    Ejercicio7("Esta palabra aparece palabra, palabra veces esta Palabra mono Mono")
}

fun Ejercicio7(texto: String) {

    val palabras = texto
        .replace(Regex("[^\\p{L}\\s]"), "")
        .lowercase()
        .split(" ")

    var map = palabras.associate { it to 0 }.toMutableMap()
    palabras.forEach { palabra ->
        map[palabra] = map.get(palabra)?.plus(1) ?: 1
    }

    map.forEach {
        println("La palabra ${it.key} aparece ${it.value} veces")
    }
}