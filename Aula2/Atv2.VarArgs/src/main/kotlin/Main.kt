package org.example

fun main() {
   for (n in ordenar(38,3,456,8,51,1,88,73)){
      print("$n")
   }
}

fun ordenar(vararg  numeros:  Int): IntArray {
      return numeros.sortedArray()
}