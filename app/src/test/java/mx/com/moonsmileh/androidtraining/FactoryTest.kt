package mx.com.moonsmileh.androidtraining

import org.junit.Assert
import org.junit.Test

/**
 * Provides a way to access functionality
 * without caring about implementation
 *
 * Separation of concerns
 * Allows for testability
 */
class FactoryTest {
    @Test
    fun currencyTest() {
        val mexicoCurrency: String = CurrencyFactory.currencyForCountry(Mexico).currency
        println("Mexico currency: $mexicoCurrency")

        val japanCurrency = CurrencyFactory.currencyForCountry(Japan("Takoyaki")).currency
        println("Japan currency: $japanCurrency")

        Assert.assertEquals(mexicoCurrency, "MXN")
        Assert.assertEquals(japanCurrency, "YEN")
    }
}