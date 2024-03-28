package com.example.calculator

sealed class CalculatorOperation(val symbol: String) {
    object Add: CalculatorOperation("+")
    object Sub: CalculatorOperation("-")

    object Mul: CalculatorOperation("x")
    object Devide: CalculatorOperation("/")

}