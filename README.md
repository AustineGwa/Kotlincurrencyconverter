# Kotlincurrencyconverter
convert foreign cash to kenyan shilling

In this application I am getting amount of currency from a user and the currency type<br/>
after which am calculating the kenyan shilling using this formular <br/>

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
