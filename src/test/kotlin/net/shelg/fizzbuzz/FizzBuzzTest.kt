package net.shelg.fizzbuzz

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class FizzBuzzTest {

    private lateinit var fizzBuzz: FizzBuzz

    @BeforeEach
    fun setUp() {
        fizzBuzz = FizzBuzz()
    }

    @Test
    fun `numbers divisble by 3 but not by 5 give Fizz`() {
        // Given:
        val number = listOf(3, 6, 9, 21, 33, 99)

        for (num in number) {
            // When:
            val result = fizzBuzz.numberToString(num)

            // Then:
            assertEquals("Fizz", result) { "Unexpected value for number $num" }
        }
    }

    @Test
    fun `numbers divisble by 5 but not by 3 give Buzz`() {
        // Given:
        val number = listOf(5, 10, 20, 35, 70, 95, 100)

        for (num in number) {
            // When:
            val result = fizzBuzz.numberToString(num)

            // Then:
            assertEquals("Buzz", result) { "Unexpected value for number $num" }
        }
    }

    @Test
    fun `numbers divisble by 3 and by 5 give FizzBuzz`() {
        // Given:
        val number = listOf(15, 30, 45, 60, 75, 90)

        for (num in number) {
            // When:
            val result = fizzBuzz.numberToString(num)

            // Then:
            assertEquals("FizzBuzz", result) { "Unexpected value for number $num" }
        }
    }

    @Test
    fun `numbers not divisble by 3 nor 5 give the number`() {
        // Given:
        val number = listOf(1, 7, 23, 56, 76, 98)

        for (num in number) {
            // When:
            val result = fizzBuzz.numberToString(num)

            // Then:
            assertEquals(num.toString(), result) { "Unexpected value for number $num" }
        }
    }

    @Test
    fun `fizzBuzzString converts the first 36 numbers as expected`() {
        // When:
        val result = fizzBuzz.fizzBuzzString()

        // Then:
        assertTrue(
            result.startsWith(
                "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz" +
                        "19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3132Fizz34BuzzFizz"
            )
        ) { "Expected result to start with $result, but was $result" }
    }
}