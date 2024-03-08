package org.example

//Função para realizar a formula.
fun calcularAreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun main() {
    println("Cálculo da Área do Retângulo")
    print("Informe a base: ")
    val base = readLine()?.toDoubleOrNull() ?: 0.0
    print("Informe a altura: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    val areaRetangulo = calcularAreaRetangulo(base, altura)
    println("Área do Retângulo: $areaRetangulo")
}