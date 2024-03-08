package org.example

// dgl = diagonal

fun calcularAreaLosango(dglMaior: Double, dglMenor: Double): Double {
    return 0.5 * dglMaior * dglMenor
}

fun main() {
    println("Cálculo da Área do Losango")
    print("Informe a diagonal maior: ")
    val dglMaior = readLine()?.toDoubleOrNull() ?: 0.0
    print("Informe a diagonal menor: ")
    val dglMenor = readLine()?.toDoubleOrNull() ?: 0.0

    val areaLosango = calcularAreaLosango(dglMaior, dglMenor)
    println("Área do Losango: $areaLosango")
}