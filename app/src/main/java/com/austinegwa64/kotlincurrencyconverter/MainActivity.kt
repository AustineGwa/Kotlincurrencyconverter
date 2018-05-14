package com.austinegwa64.kotlincurrencyconverter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import com.austinegwa64.kotlincurrencyconverter.ConverterClasses.Constants

class MainActivity : AppCompatActivity() {

    private lateinit var result: TextView
    private lateinit var foreignAmount: EditText
    private lateinit var currency: Spinner
    private lateinit var convertbtn: Button

    private var convertedAmount: Int = 0
    private var providedForeignAmount: Int = 0
    private lateinit var providedCurrency: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById(R.id.result)
        foreignAmount = findViewById(R.id.foreignAmount)
        currency = findViewById(R.id.spinner)
        convertbtn = findViewById(R.id.convertbtn)

        convertbtn.setOnClickListener { convertedAmount = convertNow() }

        result.setText(convertedAmount)
    }

    private fun convertNow(): Int {
        providedForeignAmount = Integer.parseInt(foreignAmount.text.toString())
        providedCurrency = currency.selectedItem.toString()

        val constants = Constants()

        var newAmount = 0
        when (providedCurrency) {

            "dollar" -> newAmount = providedForeignAmount * constants.dollar

            "Euro" -> newAmount = providedForeignAmount * constants.euro

            "SA_Rand" -> newAmount = providedForeignAmount * constants.sA_Rand
        }

        return newAmount

    }
}
