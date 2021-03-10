package net.shelg.fizzbuzz

class FizzBuzz {

    fun fizzBuzzString(): String =
        (1..100).joinToString(separator = "") { numberToString(it) }

    fun numberToString(number: Int): String =
        when {
            number % 15 == 0 -> "FizzBuzz"
            number % 5 == 0 -> "Buzz"
            number % 3 == 0 -> "Fizz"
            else -> number.toString()
        }

}

fun main() {
    println(FizzBuzz().fizzBuzzString())
}