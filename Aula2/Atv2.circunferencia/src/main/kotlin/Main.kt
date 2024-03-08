package org.example

import kotlin.math.PI

fun calcularAreaCircunferencia(raio: Double): Double {
    return PI * raio * raio
}

fun main() {
    println("Cálculo da Área da Circunferência")
    print("Informe o raio: ")
    val raio = readLine()?.toDoubleOrNull() ?: 0.0

    val areaCircunferencia = calcularAreaCircunferencia(raio)
    println("Área da Circunferência: $areaCircunferencia")
}