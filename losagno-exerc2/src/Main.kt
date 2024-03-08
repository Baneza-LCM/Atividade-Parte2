package funcoes

class Operacoes {
    fun area(Maior: Double, Menor: Double): Double {
        return (Maior * Menor) / 2
    }
}

fun area(Maior: Double, Menor: Double): Double {
    return (Maior * Menor) / 2
}

fun calc(Maior: Double, Menor: Double, funcao: (Double, Double) -> Double) : Double {
    return funcao(Maior, Menor)
}

fun main(args: Array<String>) {
    println("Calculando... \n")
    println("A área do losango foi: ")
    println(calc(8.0, 6.0, :: area))
}