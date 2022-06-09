package com.example.unittesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tax = Tax()
        val calTax = tax.calculateTax(grossSalary = 50000.0, taxRate =0.1)
        val calSalary = tax.calculateIncome(grossSalary = 50000.0, taxRate = 0.1)

        println("Tax amount $calTax")

        println("Tax amount " + calSalary)

    }
}