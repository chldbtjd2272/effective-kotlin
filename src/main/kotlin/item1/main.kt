import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.coroutines.*

fun main(args: Array<String>) {
    var num = 0
    (1..1000).forEach {
        thread {
            Thread.sleep(10)
            num +=1
        }
    }
    Thread.sleep(5000)
    print(num)
}

suspend fun main(){
    var num = 0
    coroutineScope {
        (1..1000).forEach {
            launch {
                delay(10)
                num += 1
            }
        }
        print(num)
    }
}