package mx.com.moonsmileh.androidtraining

object NetworkDriver {
    init {
        println("Initializing $this")
    }

    fun log(): NetworkDriver = apply { println("Network driver $this") }

}