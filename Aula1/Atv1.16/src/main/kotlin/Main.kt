package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val alunos = arrayListOf("André", "Carla", "Marcos")
    for ((indice, alunos)in alunos.withIndex()){
        println("$indice - $alunos \n")
    }
}