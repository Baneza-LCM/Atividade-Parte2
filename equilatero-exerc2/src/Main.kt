package funcoes

fun calcular(lado: Double): Double {
    return (Math.sqrt(2.0) / 3) * lado * lado
}

fun main(args: Array<String>) {
    val lado = 4.0
    val resultado = calcular(lado)
    println("Calculando... \n")
    println("A área do triângulo equilátero é: $resultado")
}
