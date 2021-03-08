package lectures.part2oop

object MethodNotations extends App{

  class Person(val name: String, favoriteMovie: String) {
    def  likes(movie: String):Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name what the heck"
    def isAlive: Boolean = true
    def apply() : String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation = operator notation (syntactic sugar)

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)

  // ALL OPERATORS ARE METHODS.

  // prefix notation
  val x = -1 // equivalent of 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ! ~

  println(!mary)
  println(mary.unary_!)

  // postfix notations
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply()) // equivalent to println(mary())
  println(mary)
  println(mary())
}