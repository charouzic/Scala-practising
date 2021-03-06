package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{

  def factorial(n: Int): Int =
  if(n <= 1) 1
  else {
    println(s"Computing factorial of $n - I first need factorial of " + (n-1))
    val result = n * factorial(n-1)
    println(s"Computed factorial of $n")
    result
  }

  //println(factorial(10))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the LAST expression

    factHelper(n, 1)
  }

  /*
  anotherFactorial(10) = factorialHelper(10, 1)
   = factorialHelper(9, 10 * 1)
   = factorialHelper(8, 9 * 10 * 1)
   = factorialHelper(7, 8 * 9 * 10 * 1)
   = ...
   = factorialHelper(2, 3 * 4 * ..*. 9 * 10 * 1)
   = factorialHelper(1, 1* 2 * 3 * 4 * ..*. 9 * 10 * 1)
   = 1* 2 * 3 * 4 * ..*. 9 * 10 * 1
   */

  //println(anotherFactorial(4))

  // WHEN YOU NEED LOOPS? USE _TAIL_ RECURSION.

  /*
    1. Concatenate a string n times
    2. IsPrime function tail recursive
    3. Fibonacci function, tail recursive
    (hint: use accumulators, sometimes you need more than one)
   */

  // 1.
  def aStringConcatenator(n: Int, word: String): String = {
    @tailrec
    def concatHelper(x: Int, accumulator: String): String =
      if (x == 1) accumulator
      else concatHelper(x - 1, word + accumulator)

    concatHelper(n, word)
  }

  //println(aStringConcatenator(3, "hello"))

  //2.

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)
  }

  //println(isPrime(2003))
  //println(isPrime(600))

  //3.
  def fibonacci(n: Int): Int = {
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fiboTailRec(i+1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailRec(2, 1, 1)
  }

  println(fibonacci(8))
}
