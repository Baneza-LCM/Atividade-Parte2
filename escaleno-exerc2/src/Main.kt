package funcoes

class Operacoes {
    fun calcular(a: Double, b: Double, c: Double): Double {
        val s = (a + b + c) / 2
        return Math.sqrt(s * (s - a) * (s - b) * (s - c))
    }
}

fun calcular(a: Double, b: Double, c: Double): Double {
    val s = (a + b + c) / 2
    return Math.sqrt(s * (s - a) * (s - b) * (s - c))
}

fun calc(a: Double, b: Double, c: Double, funcao: (Double, Double, Double) -> Double) : Double {
    return funcao(a, b, c)
}

fun main(args: Array<String>) {
    println("Calculando... \n Espere um pouco! \n")
    println("O resultado foi: ")
    println(calc(5.0,6.0, 7.0, :: calcular))
}