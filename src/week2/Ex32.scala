package week2



abstract class Expr
case class Sum(value1: Expr,value2: Expr) extends Expr
case class Mul(value1: Expr,value2: Expr) extends Expr
case class Sub(value1: Expr,value2: Expr) extends Expr
case class Div(value1: Expr,value2: Expr) extends Expr
case class Number(value1: Int) extends Expr



object Main extends App {

  def evaluate(expr: Expr): Int = {
      val result = expr match {
        case Sum(a,b) => evaluate(a) + evaluate(b)
        case Mul(a,b) => evaluate(a) * evaluate(b)
        case Sub(a,b) => evaluate(a) - evaluate(b)
        case Div(a,b) => evaluate(a) / evaluate(b)
        case Number(a) => a
      }
    result
  }

  for (amt <- Array(Number(1),Sub(Number(4),Number(5)),Sum(Number(5),Number(1)),Mul(Number(6),Number(8)), Sum(Mul(Number(6),Number(7)),Number(1)))) {
    val result = evaluate(amt)
    // Note that amt is printed nicely, thanks to the generated toString
    println(amt + ": " + result)
  }
}