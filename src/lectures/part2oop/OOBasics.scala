package lectures.part2oop

object OOBasics extends App {

  // instantiation == concrete realisation in memory that conforms the data structure and behavior described by class
  val person = new Person("John", 55)
  // person.greet("Viktor")
  //person.greet
  val person0 = new Person("Vik")
  //person0.greet

  val writerJocko = new Writer("Jocko", "Wilink", 1980)
  //println(s"Authors full name: ${writerJocko.fullName}")

  val novel = new Novel("Extreme Ownership", 2009, writerJocko)
  //println(s"The book ${novel.name} written by ${novel.isWrittenBy} was finished when the author was ${novel.authorAge}")
  val newCopy = novel.copy(2019)
  //println(s"The book ${newCopy.name} written by ${newCopy.isWrittenBy} was finished when the author was ${newCopy.authorAge}")

  val counter = new Counter(12)
  println(s"Current count = ${counter.currentCount}")
  val plusOne = counter.increment
  println(s"Adding one to ${counter.currentCount} = ${plusOne.currentCount}")
  val minusOne = counter.decrement
  println(s"Decrement one from ${counter.currentCount} = ${minusOne.currentCount}")

  val plusTen = counter.increment(10)
  println(s"Adding 10 to ${counter.currentCount} = ${plusTen.currentCount}")

  val minusFive = counter.decrement(5)
  println(s"Decrement 5 from ${counter.currentCount} = ${minusFive.currentCount}")
}

// class organises data and behavior that is code

// constructor == conditions under which the class can be instantiated
class Person(name: String, val age: Int) {
  // body - defines implementation of this class
  val x = 2

  println(1 + 3)

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi $name")

  // overloading == same functions with different signatures (different parameters, number of them, return type,..)
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)

  def this() = this("John Doe")
}

  /*
    Novel and a Writer
    Writer: first name, surname, year of birth
      - method fullname (returns full name)

    Novel: name, year of release, author (instance of Writer)
      - authorAge (age of the author at the age of release)
      - isWrittenBy(author)
      - copy (new year of release) = new instance of novel with a new year of Novel
   */

class Writer(firstName: String, surname: String, val yearOfBirth: Int) {

  def fullName: String =
    s"$firstName $surname"
}

class Novel (val name: String, val yearOfRelease: Int, val author: Writer) {
  def authorAge: Int =
    yearOfRelease - author.yearOfBirth

  def isWrittenBy: String =
    author.fullName

  def copy(newReleaseYear: Int): Novel =
    new Novel(name, newReleaseYear, author)

}

  /*
      Counter class
        - receives an int value
        - method current count
        - method to increment/decrement by one => new Counter
        - overload inc/dec to receive an amount => new Counter
   */

class Counter(count: Int) {

  def currentCount: Int = count

  def increment = new Counter(count + 1)

  def decrement = new Counter(count - 1)

  def increment(amount: Int) = new Counter(count + amount)

  def decrement(amount: Int) = new Counter(count - amount)
}


// class parameters are NOT FIELDS unless defined as "val"