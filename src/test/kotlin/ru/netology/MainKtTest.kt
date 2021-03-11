package ru.netology

import org.junit.Test

import org.junit.Assert.*

import calculateCommission

import masterCardCommission

import visaCardCommission

class MainKtTest {


    @Test
    fun calculateCommission_caseMasterCard_remittanceFail_lessThen50() {
        //arrange
        val card = "MasterCard"
        val sum = 48.0

        //act
        val result = calculateCommission(
            card = card,
            sum = sum
        )

        //assert
        assertEquals("Ошибка перевода средств", result)
    }
    @Test
    fun calculateCommission_caseMasterCard_remittanceFail_moreThen150k() {
        //arrange
        val card = "MasterCard"
        val sum = 160000.0

        //act
        val result = calculateCommission(
            card = card,
            sum = sum
        )

        //assert
        assertEquals("Ошибка перевода средств", result)
    }

    @Test
    fun calculateCommission_caseMasterCard_remittanceWithoutCommission() {
        //arrange
        val card = "MasterCard"
        val sum = 5000.0

        //act
        val result = calculateCommission(
            card = card,
            sum = sum
        )

        //assert
        assertEquals("Осуществлен перевод на сумму 5000.0", result)
    }

    @Test
    fun calculateCommission_caseMasterCard_remittanceWithCommission() {
        //arrange
        val card = "MasterCard"
        val sum = 76000.0

        //act
        val result = calculateCommission(
            card = card,
            sum = sum
        )

        //assert
        assertEquals("Осуществлен перевод на сумму 75564.0", result)
    }

   @Test
    fun calculateCommission_caseMaestro_remittanceFail_lessThen50() {
        //arrange
        val card = "Maestro"
        val sum = 48.0

        //act
        val result = calculateCommission(
            card = card,
            sum = sum
        )

        //assert
        assertEquals("Ошибка перевода средств", result)
    }

    @Test
    fun calculateCommission_caseMaestro_remittanceFail_moreThen150k() {
        //arrange
        val card = "Maestro"
        val sum = 160000.0

        //act
        val result = calculateCommission(
            card = card,
            sum = sum
        )

        //assert
        assertEquals("Ошибка перевода средств", result)
    }

    @Test
    fun calculateCommission_caseMaestro_remittanceWithoutCommission() {
        //arrange
        val card = "Maestro"
        val sum = 5000.0

        //act
        val result = calculateCommission(
            card = card,
            sum = sum
        )

        //assert
        assertEquals("Осуществлен перевод на сумму 5000.0", result)
    }

    @Test
    fun calculateCommission_caseMaestro_remittanceWithCommission() {
        //arrange
        val card = "Maestro"
        val sum = 76000.0

        //act
        val result = calculateCommission(
            card = card,
            sum = sum
        )

        //assert
        assertEquals("Осуществлен перевод на сумму 75564.0", result)
    }

    @Test
    fun calculateCommission_caseVisa_remittanceFail() {
        //arrange
        val card = "Visa"
        val sum = 49.0

        //act
        val result = calculateCommission(
            card = card,
            sum = sum
        )

        //assert
        assertEquals("Ошибка перевода средств", result)
    }

    @Test
    fun calculateCommission_caseVisa_remittanceWithCommission() {
        //arrange
        val card = "Visa"
        val sum = 140000.0

        //act
        val result = calculateCommission(
            card = card,
            sum = sum
        )

        //assert
        assertEquals("Осуществлен перевод на сумму 138985.0", result)
    }

    @Test
    fun calculateCommission_caseWorld_remittanceFail_lessThen50() {
        //arrange
        val card = "Мир"
        val sum = 49.0

        //act
        val result = calculateCommission(
            card = card,
            sum = sum
        )

        //assert
        assertEquals("Ошибка перевода средств", result)
    }

    @Test
    fun calculateCommission_caseWorld_remittanceFail_moreThen150k() {
        //arrange
        val card = "Мир"
        val sum = 160000.0

        //act
        val result = calculateCommission(
            card = card,
            sum = sum
        )

        //assert
        assertEquals("Ошибка перевода средств", result)
    }

    @Test
    fun calculateCommission_caseWorld_remittanceWithCommission() {
        //arrange
        val card = "Мир"
        val sum = 140000.0

        //act
        val result = calculateCommission(
            card = card,
            sum = sum
        )

        //assert
        assertEquals("Осуществлен перевод на сумму 138985.0", result)
    }

    @Test
    fun calculateCommission_caseVKPay_remittanceFail() {
        //arrange
        val card = "VK Pay"
        val sum = 16000.0

        //act
        val result = calculateCommission(
            card = card,
            sum = sum
        )

        //assert
        assertEquals("Ошибка перевода средств", result)
    }

    @Test
    fun calculateCommission_caseVKPay_remittance() {
        //arrange
        val card = "VK Pay"
        val sum = 14000.0

        //act
        val result = calculateCommission(
            card = card,
            sum = sum
        )

        //assert
        assertEquals("Осуществлен перевод на сумму 14000.0", result)
    }


    @Test
    fun masterCardCommission() {
        //arrange
        val commission = 4000.0

        //act
        val result = masterCardCommission(
            commission = commission
        )

        //assert
        assertEquals(3996.0, result, 0.0)
    }

    @Test
    fun visaCardCommission() {
        //arrange
        val commission = 9000.0

        //act
        val result = visaCardCommission(
            commission = commission
        )

        //assert
        assertEquals(8967.5, result, 0.0)
    }
}