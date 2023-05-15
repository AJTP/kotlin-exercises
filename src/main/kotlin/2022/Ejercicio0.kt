package `2022`
/*
 * 	-- Ejercicio1: Fizz Buzz --
 * 	Esta función imprime los números del 1 al 50
 * 	Si el número es múltiplo de 3 lo sustituye por "Fiz"
 * 	Si el número es múltiplo de 5 lo sustituye por "Buzz"
 * 	Si el número es múltiplo de 3 y 5 lo sustituye por "FizzBuzz"
 */

fun main() {
    Ejercicio0()
}


fun Ejercicio0(){
    for(i in 1 .. 100){
        val multiploDeCinco = i % 5 == 0
        val multiploDeTres = i % 3 == 0
        if(multiploDeTres && multiploDeCinco){
            println("fizzbuzz")
        }else if(multiploDeTres){
            println("fizz")
        }else if(multiploDeCinco){
            println("buzz")
        }else{
            println(i)
        }
    }
}
