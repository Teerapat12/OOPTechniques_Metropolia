
println("============ Ex1 =============")

('a'.toInt+3).asInstanceOf[Char]

def cipherOne(char: Char, shift: Int): Char = {
  val startingC = char.toInt
  if(startingC<97 | startingC > 122) return char

  var shifting = shift
  if(shift<0) shifting = 26-shift

  val shiftAmount = (startingC-97 + shifting)%26
  val newC = shiftAmount + 97
  newC.asInstanceOf[Char]
}

def cipher(s: String, shift: Int): String = {
  s.map(cipherOne(_,shift))
}

def caesarCipher(s:String): String = {
  cipher(s,13)
}

def caesarDecipher(s:String): String = {
  cipher(s,-13)
}

caesarCipher("hello world")

caesarDecipher("uryyb jbeyq")


println("============ Ex2 =============")

val rnd = scala.util.Random



def myLotto(xs: List[ Int ] = 1 to 40 toList, digit: Int = 7): List[Int] = {
  val newXs = rnd.shuffle(xs)
  if(xs.isEmpty|| digit==0) List()
//  else newXs.last + " " +myLotto(newXs.init,digit-1)
  else List(newXs.last) ::: myLotto(newXs.init,digit-1)
}

myLotto()
myLotto()
myLotto()
myLotto()

rnd.nextInt(10)

println("============ Ex3 !=============")



def fisherYates(xs: List[Int],k: Int): List[Int] ={
  if(k==0) return xs
  val randIndex = rnd.nextInt(k)
  val tmp = xs(randIndex)
  var newXs = xs.updated(randIndex, xs(k))
  newXs = newXs.updated(k, tmp)
  fisherYates(newXs, k-1)
}

// How to make dynamic initial value
fisherYates(1 to 20 toList, 19)

fisherYates(1 to 20 toList, 10)

fisherYates(1 to 40 toList,39)

println("============ Ex4 !=============")

def guessRecursive(guess: List[Int], ans: List[Int]): Int ={
  if(guess.isEmpty) return 0
  val isCorrect = ans.contains(guess.last)
  if(isCorrect)
    1 + guessRecursive(guess.init,ans)
  else
    guessRecursive(guess.init,ans)
}

def guessNumber(guess: List[Int]): Int = {
  val lotto = myLotto()
  println(lotto)
  guessRecursive(guess,lotto)
}


guessNumber(List(20,4,1,25,50,5,10))


println("============ Ex5 !=============")

def testGuess(guessNumber: Int):Unit = {
  val lotto = myLotto()

  val scoreGuesses = for(_ <- 1 to guessNumber) yield guessRecursive(fisherYates(1 to 40 toList,39).slice(0,7),lotto)
  println(scoreGuesses.count(_ == 4))
  println(scoreGuesses.count(_ == 5))
  println(scoreGuesses.count(_ == 6))
  println(scoreGuesses.count(_ == 7))


}

testGuess(100)

println("============ Ex6 !=============")

def factorial(n: Int): Int = {
  (1 to n).par.foldLeft(1) ((acc,e) => acc * e)
}

factorial(0)
factorial(1)
factorial(5)
factorial(10)

println("============ Ex7 !=============")

// Cipher using Fold
val ori = "Hello World Again"
def caesarCipherFold(ori:String): String ={ori.foldLeft("")((acc,x)=>acc+ cipherOne(x,13))}
def caesarDecipherFold(ori:String): String ={ori.foldLeft("")((acc,x)=>acc+ cipherOne(x,-13))}
caesarCipherFold(ori)
caesarDecipherFold("Hryyb Wbeyq Atnva")

// Fisher-Yates
val myList = List(20,4,1,25,50,5,10)

def fisherYatesFold(oriList: List[Int]): List[Int] = {
  oriList.foldLeft(List[Int]())((acc,e) => {
    if(acc.length==0) List(e)
    else {
      val randIndex = rnd.nextInt(acc.length)
      val tmp = acc(randIndex)
      tmp :: acc.updated(randIndex, e)
    }
  })
}

fisherYatesFold(myList)
fisherYatesFold(myList)
fisherYatesFold(myList)
fisherYatesFold(myList)
fisherYatesFold(myList)
