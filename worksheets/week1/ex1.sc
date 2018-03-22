print("============Ex1-2============\n")
val a: Int = 8.*((4.*(3)).+(6))./(2)

print("============Ex1-3============\n")
var l = Array("Hello", "World", "Scala")

def joinString(l: Array[String]): String ={
  l.mkString(" and ")
}

var ex13Ens = joinString(l)

print("============Ex1-4============\n")

for (a <- 1 to 10; b <- 1 to 10; c <- 1 to 10 if a*a+b*b==c*c ) printf("%d, %d, and %d could make a right triangle\n",a,b,c)
