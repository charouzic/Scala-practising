package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE == cannot be changed/rewritten

  // COMPILER can infer types

  val aString: String = "wasup, this is a string";  val anotherString: String = "bye bye"

  val aBoolean: Boolean = true
  val aChar: Char = 'a' // notice the single quotes
  val anInteger : Int = x
  val aShort: Short = 32767 // two bytes instead of 4 bytes == up to 32767
  val aLong: Long = 2424555245L // notice the L at the end -> notification for compiler that is
  val aFloat: Float = 2.1f // notice the f at the end -> -||-
  val aDouble: Double = 2.11

  // variables
  var aVariable: Int = 4

  aVariable = 5 //used for side effects
}
