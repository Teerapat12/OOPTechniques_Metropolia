package week5


object Main{

  def main(args: Array[String]): Unit = {


//    var s1 = new StackImmutable[Int](List(20,30))
//
//    s1 = s1.push(1)
//    s1 = s1.push(2)
//    s1 = s1.push(3)
//    s1 = s1.push(4)
//    s1 = s1.push(5)
//
//    println(s1.topstack())
//    s1 = s1.pop()
//
//    println(s1.topstack())
//    s1 = s1.pop()
//
//    println(s1.topstack())
//    s1 = s1.pop()
//
//    println(s1.topstack())
//    s1 = s1.pop()
//
//    println(s1.topstack())
//    s1 = s1.pop()
//
//    println(s1.topstack())
//    s1 = s1.pop()
//
//    println(s1.topstack())
//    s1 = s1.pop()
//
//    val s2 = new StackMutable[String](List("Anna","Bella"))
//
//    s2.push("Charles")
//    s2.push("Dogma")
//    s2.push("Euler")
//    s2.push("Fynn")
//    s2.push("George")
//
//    println(s2.topstack())
//    s2.pop()
//
//    println(s2.topstack())
//    s2.pop()
//
//    println(s2.topstack())
//    s2.pop()
//
//    println(s2.topstack())
//    s2.pop()
//
//    println(s2.topstack())
//    s2.pop()
//
//    println(s2.topstack())
//    s2.pop()
//
//    println(s2.topstack())
//    s2.pop()




    val bt = new BinaryTree[Integer]()
//    val bt = new ImmutableBinaryTree[Integer]()

    bt.add(10)
    bt.add(2)

    bt.add(5)

    bt.add(7)

    bt.add(9)
    bt.add(9)
    bt.add(9)


    println(bt.smallest())

    println(bt.largest())
    println(bt.size)
    println(bt.getList())


    print(bt)
  }
}
