package org.example

inline fun transacao(funcao: () -> Unit) {
    println("Abrindo transação")
    try {
        funcao()
    } finally {
        println("fechando transação")
    }
}

fun main(args: Array<String>) {
    transacao{
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }

}