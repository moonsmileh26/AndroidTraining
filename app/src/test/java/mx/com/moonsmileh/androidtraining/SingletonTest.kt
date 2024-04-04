package mx.com.moonsmileh.androidtraining

import org.junit.Assert
import org.junit.Test

/**
 * Only one instance
 * Single point of access for a resource
 **/
class SingletonTest {
    @Test
    fun testSingleton() {
        println("Start")
        val networkDriverOne = NetworkDriver.log()
        val networkDriverTwo = NetworkDriver.log()
        Assert.assertEquals(networkDriverOne, networkDriverTwo)
        Assert.assertEquals(networkDriverOne, NetworkDriver)
        Assert.assertEquals(networkDriverTwo, NetworkDriver)
    }
}