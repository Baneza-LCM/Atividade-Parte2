package funcoes

class Operacoes {
    fun calcular(b: Double, a: Double): Double {
        return b * a
    }
}

fun calcular(b: Double, a: Double): Double {
    return (b * a) / 2
}

fun calc(b: Double, a: Double, funcao: (Double, Double) -> Double) : Double {
    return funcao(b, a)
}

fun main(args: Array<String>) {
    println("Calculando... \n Espere um pouco! \n")
    println("O resultado foi: ")
    println(calc(5.0,6.0, :: calcular))
}
