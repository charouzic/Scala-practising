package lectures.part2oop

object MethodNotations extends App{

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def  likes(movie: String):Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name what the heck"
    def isAlive: Boolean = true
    def apply() : String = s"Hi, my name is $name and I like $favoriteMovie"

    def apply(number: Int) : String = s"$name watched $favoriteMovie $number times"

    // 1.
    def + (nickname: String) : Person = new Person(s"$name ($nickname)", favoriteMovie)

    // 2.
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    // 3.
    def learns(item: String) : String = s"$name learns $item"

    // 4.
    def learnsScala : String = learns("Scala") // this learns "Scala"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation = operator notation (syntactic sugar)

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  //println(mary + tom)

  // ALL OPERATORS ARE METHODS.

  // prefix notation
  val x = -1 // equivalent of 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ! ~

  //println(!mary)
  //println(mary.unary_!)

  // postfix notations
  //println(mary.isAlive)
  //println(mary isAlive)

  // apply
  //println(mary.apply()) // equivalent to println(mary())
  //println(mary)
  //println(mary())

  /*
    1. overload the + operator --> returns new Person
      mary + "the rockstar" => new Person "Mary(the rockstar)"

    2. add and age to the Person class (default value == 0)
       add an unary + operator=> new person with the age + 1
       +mary => mary with the age incremented

    3. add a "learns" method in the Person class (receives string parameter) => returns sentence "Mary learns scala"
       Add a learnsScala method, calls learns method with "Scala"
       Use it in postfix notation

    4. Overload the apply method
       receives number and returns string
       mary.apply(2) => "Mary watched the Inception 2 times"
   */

  // 1.
  println((mary +"the rockstar")())

  // 2.
  println(mary.unary_+.unary_+.unary_+.age)
  println((+mary).age)

  // 3.
  println(mary.learns("backend engineering"))
  println(mary.learnsScala)


  // 4.
  println(mary(3))
}
