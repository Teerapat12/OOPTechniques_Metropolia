package week1.ex12

object Main{

  def main(args: Array[String]) {


    // Number 1
    val class11 = MyClass1("OOP1", 5)
    println(s"Class ${class11.name} has a credits of ${class11.credits}")
    class11.credits = 10
    println(s"Class ${class11.name} has a credits of ${class11.credits}")

    // Number 2
    val class21 = new MyClass2("Programming", 3)
    println(s"Class ${class21.name} has a credits of ${class21.credits}")
    val newClass21 = class21.addCredits(5)
    println(s"New Class ${newClass21.name} has a credits of ${newClass21.credits}")


    // Number 3
    val class12 = MyClass1("API", 5)
    val class13 = MyClass1("Data", 5)
    val class14 = MyClass1("Error", 5)
    println(class11.name)

    // Number 4
    // MyClass1 is easier but MyClass2 is safer due to its immutable patterns.


    // Number 5
    val myPen = new MyPen()
    myPen.write("Hello World")
    // Oops I forget to open the pen cap
    myPen.open()
    // I got to excited and try to open it again
    myPen.open()

    myPen.write("Hello World")
    myPen.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ")

    myPen.refillInk(30)
    myPen.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ")

    myPen.close()
  }


}
