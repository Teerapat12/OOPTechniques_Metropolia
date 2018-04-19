package week4


object Main{

  def main(args: Array[String]): Unit = {
    val acc = new FutureAccount("Teerapat", 1000)
    acc.status()

    val threads = (1 to 10).map((t) => new Thread(() => (1 to 500).foreach((i) => acc.deposit(100))))
    threads.foreach(_.start)
    threads.foreach(_.join())

    acc.status()
  }
}
