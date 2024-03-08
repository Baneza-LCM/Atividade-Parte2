package funcoes

class Operacoes {
    fun multiplicar(a: Double, h: Double): Double {
        return a * h
    }
}


fun multiplicar(a: Double, h: Double): Double {
    return a * h
}

fun calc(a: Double, h: Double, funcao: (Double, Double) -> Double) : Double {
    return funcao(a, h)
}

fun main(args: Array<String>) {
    println("O resultado foi: ")
    //println(calc(2.0, 10.5, Operacoes()::multiplicar))
    println(calc(2.0, 10.5, :: multiplicar))
}