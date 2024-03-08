

fun calcularAreaTriangulo(base: Double, altura: Double): Double {
    return 0.5 * base * altura
}

fun main() {
    println("Cálculo da Área do Triângulo")
    print("Informe a base: ")
    val base = readLine()?.toDoubleOrNull() ?: 0.0
    print("Informe a altura: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    val areaTriangulo = calcularAreaTriangulo(base, altura)
    println("Área do Triângulo: $areaTriangulo")
}