package lectures.part1basics

object CBNvsVBV extends App{

  def calledByValue(x: Long): Unit = {
    println("by value:" + x)
    println("by value:" + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name:" + x) // it is called as is == println("by name:" + System.nanoTime())
    println("by name:" + x)
  }

  //calledByValue(System.nanoTime())
  //calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)

  // printFirst(infinite(), 34) --> it crashes on StackOverFlowError
  printFirst(34, infinite()) // this one does not crash... it is evaluated before the program runs
}
