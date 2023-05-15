package `2022`
/*
 * 	-- Ejercicio5: Area de un polígono --
 * 	Esta función permite calcular el área de un Triángulo, Cuadrado o Rectángulo
 */

fun main() {
    Ejercicio4(Triangulo(2.0,3.0))
    Ejercicio4(Cuadrado(2.0))
    Ejercicio4(Rectangulo(2.0,3.0))
}

fun Ejercicio4(poligono: Poligono):Double {
    poligono.PrintArea()
    return poligono.Area()
}

interface Poligono{
    fun Area():Double
    fun PrintArea()
}
data class Triangulo(val base:Double,val altura:Double): Poligono {
    override fun Area():Double{
        return base * altura / 2
    }

    override fun PrintArea() {
        println("El área del Triángulo es ${Area()}")
    }
}

data class Cuadrado(val lado:Double): Poligono {
    override fun Area():Double {
        return lado * lado
    }

    override fun PrintArea() {
        println("El área del Cuadrado es ${Area()}")
    }

}

data class Rectangulo(val base:Double,val altura:Double): Poligono {
    override fun Area():Double {
        return base * altura
    }

    override fun PrintArea() {
        println("El área del Rectángulo es ${Area()}")
    }

}