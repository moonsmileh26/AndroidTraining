package mx.com.moonsmileh.androidtraining

sealed class Country {
    object UnitedStates : Country()
}

object Spain : Country()
data object Mexico : Country()
data class Japan(val food: String) : Country()


class Currency(val currency: String)

object CurrencyFactory{
    fun currencyForCountry(country: Country):Currency =
        when(country){
            is Country.UnitedStates -> Currency("USD")
            is Spain -> Currency("EUR")
            is Japan -> Currency("YEN")
            is Mexico -> Currency("MXN")
        }
}