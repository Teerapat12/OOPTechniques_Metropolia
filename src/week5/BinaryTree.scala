package week5


class Node[T<: Comparable[T]](var _val: T, var left: Node[T] = null, var right: Node[T]= null) {
  def value() = {_val}

  def add(newItem: T): Unit = {
    if(_val.compareTo(newItem) >= 0){
      if(left==null){ left = new Node[T](newItem)}
      else {left.add(newItem)}
    }
    else{
      if(right==null){ right = new Node[T](newItem)}
      else {right.add(newItem)}
    }
  }

  def largest(): T = {
    if(right==null) _val
    else right.largest()
  }

  def smallest(): T = {
    if(left==null) _val
    else left.smallest()
  }

  def getList(): List[T] = {
    if(left==null && right == null){
      List(_val)
    }
    else if(left==null){
      List(List(_val), right.getList()).flatten
    }
    else if(right==null){
      List(left.getList(),List(_val)).flatten
    }
    else{
      List(left.getList(),List(_val), right.getList()).flatten
    }
  }


}

class BinaryTree[T<: Comparable[T]](var root: Node[T]=null, var size: Int = 0){

  def add(newItem: T) = {
    if(root==null){root = new Node[T](newItem)}
    else {
      root.add(newItem)
      println(getList())
      size = size + 1
    }
  }

  def largest() = {
    root.largest()
  }

  def smallest() = {
    root.smallest()
  }

  def getList() = {
    root.getList()
  }


}
