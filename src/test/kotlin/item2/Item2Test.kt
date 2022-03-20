package item2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertContains

internal class Item2Test {

    @Test
    fun getWeather() {
        assert(Item2.getWeather(4) == "cold-BLUE")
    }

    @Test
    internal fun 스코프_범위를_줄인_경우() {
        val primes = sequence {
            var numbers = generateSequence(2) {it + 1}
            while (true){
                println("--------------")
                val prime = numbers.first()
                yield(prime)
                numbers = numbers.drop(1)
                    .filter {
                        println("$it-$prime")
                        it % prime != 0 }
            }
        }

        assert(primes.take(5).toList() == listOf(2,3,5,7,11))
    }

    @Test
    internal fun 소수구하기_캡처링() {
        val primes = sequence {
            var numbers = generateSequence(2) {it + 1}
            var prime: Int
            while (true){
                println("--------------")
                prime = numbers.first()
                yield(prime)
                numbers = numbers.drop(1)
                    .filter {
                        println("$it-$prime")
                        it % prime != 0 }
            }
        }

        assert(primes.take(5).toList() == listOf(2,3,5,6,7))
    }


}