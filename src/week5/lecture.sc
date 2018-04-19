import scala.concurrent.Future

val ft1 = Future {Thread.sleep(1000); 23+23}
val ft2 = Future {Thread.sleep(1000); 23+23}

Thread.sleep(2000)