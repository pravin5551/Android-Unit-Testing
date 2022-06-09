package com.example.unittesting

class Tax {

    fun calculateTax(grossSalary: Double, taxRate: Double): Double {
        return grossSalary * taxRate
    }

    fun calculateIncome(grossSalary: Double, taxRate: Double): Double {
        return grossSalary - (grossSalary * taxRate)
    }
}