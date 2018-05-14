package com.austinegwa64.kotlincurrencyconverter.ConverterClasses

/**
 * Created by gwaza on 5/13/2018.
 */


class Constants {
    var dollar = 100
    var euro = 130
    var sA_Rand = 30

    // this is an empty constructor

    constructor()

    // this is a parameterized constructor

    constructor(dollar: Int, euro: Int, SA_Rand: Int) {
        this.dollar = dollar
        this.euro = euro
        this.sA_Rand = SA_Rand
    }


}
