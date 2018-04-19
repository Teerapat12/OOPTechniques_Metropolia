package week5


class StackImmutable[T](val s: List[T]){

  override def toString = ""+s.last

  def push(newItem: T) = {
    new StackImmutable[T](s:+ newItem)
  }

  def pop() = {
    new StackImmutable[T](s.init)
  }

  def topstack() ={
    if(s.length>0)
      s.last
    else
      null
  }

}