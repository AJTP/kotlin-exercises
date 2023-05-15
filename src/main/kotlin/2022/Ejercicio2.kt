package `2022`
/*
 * 	-- Ejercicio3: La sucesión de Fibonacci --
 * 	Esta función imprime los 50 primeros números
 * 	de la sucesión de Fibonacci
 */

fun main(args: Array<String>) {
    Ejercicio2()
}

fun Ejercicio2(){
    var a:Long = 0
    var b:Long = 1

    for(i in 1..50){
        println(a)
        val c:Long = a
        a = b
        b = a+c
    }
}
