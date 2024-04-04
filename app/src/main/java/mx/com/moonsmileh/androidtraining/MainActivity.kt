package mx.com.moonsmileh.androidtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import mx.com.moonsmileh.androidtraining.databinding.ActivityMainBinding
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        GlobalScope.launch(Dispatchers.IO) {

            val time = measureTimeMillis {
                val answer1 = fakeNetworkCall1()
                val answer2 = fakeNetworkCall2()
                Log.d(TAG, answer1)
                Log.d(TAG, answer2)
            }
            Log.d(TAG, "Time tooks $time ms")
        }

    }

    suspend fun fakeNetworkCall1(): String {
        delay(3000L)
        return "Answer 1"
    }

    suspend fun fakeNetworkCall2(): String {
        delay(3000L)
        return "Answer 2"
    }


    suspend fun canceCall() {
        val job = GlobalScope.launch(Dispatchers.Default) {
            repeat(5) {
                Log.d(TAG, "Coroutine $it still working")
                delay(1000L)
            }
        }

        runBlocking {
            delay(2000L)
            job.cancel()
            Log.d(TAG, "Continue in ${Thread.currentThread().name}")
        }
    }

    suspend fun doNetworkCall(): String {
        delay(3000L)
        Log.d(this@MainActivity.localClassName, "Hello from ${Thread.currentThread().name}")
        return "Response"
    }

    private fun runBlockingExample() {
        Log.d(TAG, "Before runBlocking")
        // This coroutine will block the main thread
        runBlocking {

            launch {
                delay(3000L)
                Log.d(TAG, "Finish IO Coroutine 1")
            }
            launch {
                delay(3000L)
                Log.d(TAG, "Finish IO Coroutine 2")
            }

            Log.d(TAG, "Start runBlocking")
            delay(5000L)
            Log.d(TAG, "End runBlocking")

        }
        Log.d(TAG, "after runBlocking")
    }

}