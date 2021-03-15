package lectures.part2oop

object Objects extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("staci")
  object Person { // type + its only instance ==> only instance of its type
    // "static"
    val N_EYES = 2
    def canFly : Boolean = false;

    def apply(mother: Person, father: Person): Person = new Person ("Bobbie")
  }

  class Person(val name: String) {
    // instance-level functionality
  }
  // COMPANIONS

  println(Person.N_EYES)
  print(Person.canFly)

  // Scala object == SINGLETON INSTANCE (no matter how many "instances" we create it still points at the same instance)
  val mary = new Person("Mary")
  val john = new Person ("John")
  println(mary == john) // returns true

  val bobbie = Person(mary, john)

  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit

}
