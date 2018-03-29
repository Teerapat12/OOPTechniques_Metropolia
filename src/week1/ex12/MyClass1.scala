package week1.ex12

class MyClass1(private var _name:String = "no name", private var _credits: Integer = 0) {// How to hide constructor
  def name = _name
  def name_=(newName: String): Unit = {_name=newName}
  def credits = _credits
  def credits_=(newCredits: Integer): Unit = {_credits=newCredits}
}

object MyClass1 {
  private var classNumber = 0
  private val maxClass = 3
  def apply(_name:String, _credits:Integer): MyClass1 = {
    if(classNumber<maxClass) {
      classNumber +=1
      new MyClass1(_name, _credits)
    }
    else{
      println("Too much classroom! Maximum is "+maxClass)
      // What should I return here
      return null
    }
  }
}

//public class MyClass1 {
//  private String name = "no name"; private int credits = 0;
//  public String getName() { return name;
//  }
//  public void setName(String name) { this.name = name;
//  }
//  public int getCredits() { return credits;
//  }
//  public void setCredits(int credits) { this.credits = credits;
//  } }