package week5



class StackMutable[T](var s: List[T]){

  override def toString = ""+s;

//
  def push(newItem: T) = {
    this.s = this.s :+ newItem
  }

  def pop() = {
    val ts = this.topstack()
    this.s = this.s.dropRight(1)
    ts
  }

  def topstack() ={
    if(s.length>0)
      s.last
    else
      null
  }

}
