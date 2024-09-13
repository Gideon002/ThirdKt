package com.example.myapplication3.ui.theme

//fun add(a: Int, b: Int -> a + b)
//val add = {a: Int, b: Int -> a + b}
fun add(a: Int, b: Int, summation: (Int, Int) -> Int): Int {
    return summation(a, b)
}

fun main() {
    val sum = add(4, 19) { x, y -> x + y }
    println("The sum is $sum")
}