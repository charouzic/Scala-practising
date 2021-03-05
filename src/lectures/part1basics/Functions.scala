package lectures.part1basics

object Functions extends App{

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("whhh", 4))

  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString + "\n"
    else aString + "\n" + aRepeatedFunction(aString, n-1) // recursive function - it calls itself
  }

  println(aRepeatedFunction("hel", 5))

  // WHEN YOU NEED LOOPS, USE RECURSION!

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a+b

    aSmallerFunction(n, n-1)
  }

  /*
    1. A greeting function (name, age) => "Him my name is  $name and I'm $age years old"
    2. Factorial function 1 * 2 * 3 * ... * n
    3. A Fibonacci function
        f(1) = 1
        f(2) = 1
        f(3) = 2
        f(4) = 3
        f(5) = 5
        f(6) = f(n-1) + f(n-2)
    4. Test if a number is prime
   */

  // 1.
  def aGreeterFunction(name: String, age: Int): String =
    s"Hi my name is $name and I'm $age years old"

  //println(aGreeterFunction("Viktor", 23))

  // 2.
  /*
  aFactorial(5)
  1
   */
  def aFactorial(n: Int): Int =
    if(n <= 0) 1
    else n * aFactorial(n-1)

  //println(aFactorial(4))

  //3.
  def aFibonacci(n: Int): Int =
    if (n <= 2) 1
    else aFibonacci(n - 1) + aFibonacci(n - 2)


  //println(aFibonacci(10))

  // 4. one wa
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else t % 2 != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(23 * 23))

}
