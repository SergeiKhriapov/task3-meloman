package ru.netology

import kotlin.math.ceil

fun main() {
    val amount = 15_000
    val isRegularCustomer = true
    val discountBasedOnAmount = if (amount >= 1001 && amount <= 10_000) {
        100
    } else if (amount > 10_000) {
        amount * 0.05
    } else {
        0
    }
    val finalAmountAfterDiscount = amount - discountBasedOnAmount.toInt()
    val regularCustomerDiscount = if (isRegularCustomer) finalAmountAfterDiscount * 0.01 else 0.0
    val finalPrice = finalAmountAfterDiscount - regularCustomerDiscount

    println(
        """
        Сумма покупки составила $amount руб., итоговая стоимость с учетом скидки: ${ceil(finalPrice).toInt()} руб.
    """.trimIndent()
    )
}