package lectures.part2oop

object InheritanceAndTraits extends App {

  // single class inheritance
  sealed class Animal {
    val creatureType = "wild"
    def eat = println("nomnom") // if def eat is private, we can access it only within the class
    // if the method is protected, we can call it from the child class
  }

  class Cat extends Animal

  val cat = new Cat
  cat.eat


  // constructors
  class Person(name:String, age: Int) {
    def this(name: String) = this (name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
    override def eat = {
      super.eat
      println("crunch crunch")
    }
    //override val creatureType: String = "domestic"
  }

  val dog = new Dog("warewolf")
  dog.eat
  println(dog creatureType)

  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal =  new Dog("K9")
  unknownAnimal.eat

  // overRIDING vs overLOADING

  // super

  // preventing overrides
  // 1 - final on member
  // 2 - final on class
  // 3 - seal the class == extend classes in THIS FILE, prevent extension in other files
}
