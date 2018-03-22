package week1.ex12

class MyClass2(private val _name:String = "no name", private val _credits: Integer = 0) {
  def name = _name
  def credits = _credits

  def this(credits: Integer){this("no name", credits)}  // What's the different between ){} and )={}
  def addCredits(n_credits: Integer): MyClass2 = {
    new MyClass2(_name, _credits+n_credits)
    //this(_name, _credits+n_credits)
  }
}


//public class MyClass2 { private final String name; private final int credits;
//  public MyClass2(String name, int credits) { this.name = name;
//    this.credits = credits;
//  }
//  public MyClass2(int credits) { this("no name", credits);
//  }
//  public MyClass2 addCredits(int credits) {
//    return new MyClass2(name, this.credits + credits);
//  }
//  public String getName() { return name;
//  }
//  public int getCredits() { return credits;
//  } }