package `2022`
/*
 *	-- Ejercicio7: Invirtiendo Cadenas --
 *	Esta función invierte el orden de una cadena sin funciones automáticas
 *	También imprime los números del 1 al 100
 */

fun main(){
    println(Ejercicio6("Hola mundo"))
    println(Ejercicio6("Prueba"))
}

fun Ejercicio6(cadena:String):String{
    var array = cadena.toCharArray()
    var vuelta = ""
    for(i in array.size - 1 downTo 0){
        vuelta+=array[i]
    }
    return vuelta
}