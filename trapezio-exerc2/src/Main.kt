package funcoes

class Operacoes {
    fun calcular(bMaior: Double, bMenor: Double, alt: Double): Double {
        return ((bMaior + bMenor) * alt) / 2
    }
}

fun calcular(bMaior: Double, bMenor: Double, alt: Double): Double {
    return ((bMaior + bMenor) * alt) / 2
}

fun calc(bMaior: Double, bMenor: Double, alt: Double, funcao: (Double, Double, Double) -> Double) : Double {
    return funcao(bMaior, bMenor, alt)
}

fun main(args: Array<String>) {
    println("Calculando... \n")
    println("A área do trapézio foi: ")
    println(calc(6.0, 4.0, 5.0, :: calcular))
}