package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val nota = 6
    if (nota in 9..10){
        println("Fantastico")
    }else if (nota in 7..10){
        println("Parabens")
    }else if(nota in 4..6){
        println("Tem como recuperar")
    }else if(nota in 0..3){
        println("Te vejo na próxima ano")
    } else{
        println("Nota inválida")
    }
}