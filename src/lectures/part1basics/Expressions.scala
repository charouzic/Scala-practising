package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | << >> >>>

  println(1 == x) // this expression  is a boolean ... x is not 1 --> false
  // == != > >= < <=

  println(!( 1 == x)) // logical negation
  // ! && ||

  var aVariable = 2
  aVariable += 13 // also works with -= *= /= .... side effects
  println(aVariable)

  // Instructions (DO) vs Expression (VALUE)

  // IF expression --> gives back value
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)

  //var i = 0
  //while (i <10) {
  //  println(i)
  //  i += 1
  //}

  // NEVER WRITE LOOPS AGAIN

  // EVERYTHING IN SCALA IS AND EXPRESSION

  val aWeirdValue = (aVariable = 3) // Unit === void --> don't return anything meaningful
  println(aWeirdValue) // prints this: ()

  // side effects: println(), whiles, reassigning

  // Code blocks --> expressions and its value is the last line of the block
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "whasup" else "bye"
  }

  // 1. difference between "hello world" vs. println("hello world")?
  // "hello world" is a string value whereas println is expression (side effect returning unit printing to console)

  val someValue = {
    2 < 3
  } // this is a bool value which is true

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  } // this is an int value 42
}
