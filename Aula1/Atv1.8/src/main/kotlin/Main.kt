package org.example

import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val scanner = Scanner(System.`in`)
    val nota: Double = scanner.nextDouble()
    println("Sua nota é: $nota")
    if(nota >=7.0){
        println("Aprovado")
    }else{
        println("Reprovado")
    }
}