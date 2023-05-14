/*
 * 	-- Ejercicio2: ¿Es un anagrama? --
 * 	Esta función recibe dos cadenas de caracteres
 * 	comprueba que no sean la misma palabra y devuelve
 * 	true o false si una cadena es anagrama de la otra
 */

fun main(args: Array<String>) {
    println(Ejercicio2("Zara","Raza"))
    println(Ejercicio2("Arroz","Arroz"))
    println(Ejercicio2("Pepe","Pepi"))
}


fun Ejercicio2(cadena1:String,cadena2:String):Boolean{
    if(cadena1.lowercase() == cadena2.lowercase()){
        return false
    }

    val array1 = cadena1.lowercase().toCharArray()
        .sortedArray()
    val array2 = cadena2.lowercase().toCharArray()
        .sortedArray()

    if(array1.contentEquals(array2)){
        return true
    }else{
        return false
    }
}
