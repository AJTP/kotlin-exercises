/*
 *	-- Ejercicio4: ¿Es un número primo? --
 *	Esta función comprueba si un número es primo o no
 *	También imprime los números del 1 al 100
 */

fun main(args: Array<String>) {
    Ejercicio4()

}

fun Ejercicio4() {
    (1..100).forEach{num ->
        if(EsPrimo(num)){
            println(num)
        }
    }
}

fun EsPrimo(numero:Int):Boolean{
    if(numero < 2){
        return true
    }

    for (i in 2 until numero) {
        if (numero % i == 0) {
            return false
        }
    }

    return true
}
