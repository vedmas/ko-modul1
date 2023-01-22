package ru.kotlin.otuskotlin.modul1.m1l3

import org.junit.Assert
import java.math.BigDecimal
import java.text.NumberFormat
import java.util.Currency
import java.util.Locale
import kotlin.test.Test

class Cash
    constructor(
    var amount: BigDecimal,
    val currency: Currency) {

    constructor(
        amount: String,
        currency: Currency
    ) : this(BigDecimal(amount), currency)

    fun format(locale: Locale): String {
        val formatter = NumberFormat.getCurrencyInstance(locale)
        return formatter.format(amount)
    }

    operator fun minus(other: Cash): Cash {
        require(currency == other.currency) {
            "Summand should be of the same currency"
        }
        return Cash(amount - other.amount, currency)
    }

    override fun toString(): String {
        return "ru.kotlin.otuskotlin.modul1.m1l3.Cash(amount=$amount, currency=$currency)"
    }
}

class CashTest{

    @Test
    fun test(){
        val a = Cash("10", Currency.getInstance("USD"))
        val b = Cash("20", Currency.getInstance("USD"))
        val c = a - b
        c.amount = BigDecimal.TEN
        println(c.amount)
        println(a)
        println(c.format(Locale.UK))
        Assert.assertEquals(c.amount, BigDecimal.TEN)
    }
}