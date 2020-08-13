package src;
// So if in the same dir no need for import?
// import src.Test;

class Potato {
  public int x, y, z;
  public static int a = 0;

  public Potato() {
    // I wonder if cpp can do this? Just not this way probably
    this(77, 66);
  }

  public Potato(int x, int y) {
    this.x = x;
    this.y = y; 
  }
  // Default code for every constructor
  {
    Potato.a += 1;
    this.z = 99;
  }
}

public class Main {

  public static void main(String[] args) {
    // setting a ref to null tells the garbage collector to clean it
    Test test = new Test(7);
    meth(test); // so objects are passed by refernece
    Potato potato = new Potato();
    Potato potatoOne = new Potato();
    Potato potatoTwo = new Potato();
    System.out.printf("%d %d %d\n%d\n", potato.x, potato.y, potato.z, Potato.a);
  }

  public static void meth(Test test) {
    test.x = 88;
    test = new Test(2);
  }
}