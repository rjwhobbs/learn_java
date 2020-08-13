package src;
// So if in the same dir no need for import?
// import src.Test;

class Potato {
  public int x, y, z;

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
    this.z = 99;
  }
}

class Main {

  public static void main(String[] args) {
    // setting a ref to null tells the garbage collector to clean it
    Test test = new Test(7);
    meth(test); // so objects are passed by refernece
    Potato potato = new Potato();
    System.out.printf("%d %d %d\n", potato.x, potato.y, potato.z);
  }

  public static void meth(Test test) {
    test.x = 88;
    test = new Test(2);
  }
}