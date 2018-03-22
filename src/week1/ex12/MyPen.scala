package week1.ex12

class MyPen() {

  private var _isOpen:Boolean = false
  private var _ink: Integer=20

//Getter and setter
  def isOpen=_isOpen
  def ink=_ink

  def open(): Unit = {
    if(!_isOpen){println("[The pen is opened]"); _isOpen = true}
    else{ println("The pen is already open!")}
  }

  def close(): Unit = {
    if(_isOpen){println("[The pen is closed]"); _isOpen = false}
    else{ println("The pen is already close!")}
  }

  def write(message: String): Unit = {
    if(!_isOpen){ println("[Nothing happen. Maybe you forgot to open the pen?]")}
    else{
      val writtenMessage = message.slice(0,_ink)
      print(writtenMessage)
      _ink -= message.length()
      if(_ink<0){
        _ink = 0
        println("... [Seems like you are out of inks]")
      }
    }
    println()
  }

  def refillInk(newInks: Integer): Unit = {
    if(newInks>0){println("[Ink refilled]"); _ink+=newInks}
    else {println("That is not a valid inks!")}

  }


}
