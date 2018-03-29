package week2

class Person(val name: String) {
  println(s"[Superclass] Person ${name} is created")
  override def toString = { s"Person name: $name" }

}

class Policeman(_name: String) extends Person("Officer "+ _name)  {
  println(s"[Class] Policeman ${name} is created")
  override def toString = { s"Police name: $name\n" }

//  def arrest(msg: String): Unit = {
//    print(this)
//    work(s"${msg}. You have the right to remain silence!")
//  }
}

trait PoliceDuty{
  println("[Super Trait] Police Duty is created")
  def work(msg: String) {println(s"Hey this is police! Stop! ${msg}")}
}


trait ShootWithGun extends PoliceDuty{
  println("[Trait] ShootWithGun Duty is created")
  override def work(msg: String) {
    super.work(s"[Shoot!] ${msg}")
  } }

trait ArrestMessage extends PoliceDuty{
  println("[Trait] ArrestMessage Duty is created")
  override def work(msg: String) {
    super.work(s"You are under arrest!! ${msg}")
  } }


//object Main{
//
//  def main(args: Array[String]) {
//    val police1 = new Policeman("John") with PoliceDuty
//    println()
//    val police2 = new Policeman("Jim") with ShootWithGun with ArrestMessage
//    println()
//    val police3 = new Policeman("Jack") with ArrestMessage with ShootWithGun
//    println()
//
//    police1.work("Tim Burling")
//    println()
//    police2.work("Tim Burling")
//    println()
//    police3.work("Tim Burling")
//  }
//}

//Traits only have parameter less default constructor, but any statements in trait body are executed when that is called, just like with classes.
//For a class mixing in traits, the construction order is:
//1. Superclass constructor
//2. Trait constructors in left-to-right order
//3. For every trait, parent traits are constructed first but each only once
//4. Class constructor
//