package week5

class ImNode[T<: Comparable[T]](var _val: T, var left: ImNode[T] = null, var right: ImNode[T]= null) {
  def value() = {_val}

  def add(newItem: T): ImNode[T] = {
    if(_val.compareTo(newItem) >= 0){
      if(left==null){ new ImNode(_val,new ImNode[T](newItem),right)}
      else {new ImNode(_val, left.add(newItem),right)}
    }
    else{
      if(right==null){new ImNode(_val,left,new ImNode[T](newItem)) }
      else {new ImNode(_val, left,right.add(newItem))}
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

class ImmutableBinaryTree[T<: Comparable[T]](var root: ImNode[T]=null, var size: Int = 0){

  def add(newItem: T) = {
    if(root==null){root = new ImNode[T](newItem)}
    else {
      root = root.add(newItem)
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
