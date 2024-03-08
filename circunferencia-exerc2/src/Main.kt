package funcoes

class Operacoes {
    fun calcular(r: Double): Double {
        return Math.PI * r * r
    }
}

fun calcular(r: Double): Double {
    return Math.PI * r * r
}

fun calc(r: Double, funcao: (Double) -> Double) : Double {
    return funcao(r)
}

fun main(args: Array<String>) {
    println("Calculando... \n")
    println("A área da circunferência foi: ")
    println(calc(2.0, :: calcular))
}