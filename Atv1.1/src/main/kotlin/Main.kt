package org.example

import java.awt.datatransfer.StringSelection

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_372_036_854_775_806
    val num5: Float =  3.14F
    val num6: Double = 3.14
    val char1: Char = '?'
    val char2: Char = '1'
    val char3: Char = 'G'

    val boolean: Boolean = true
    println(listOf(num1, num2, num3, num4, num5, num6, char1, char2, char3, boolean))
    println(2 is Int)
    print(21474836648 is Long)
    println(1.0 is Double)

    println(10.dec())
}