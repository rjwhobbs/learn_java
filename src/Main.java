package src;
// So if in the same dir no need for import?
// import src.Test;

class Main {

  public static void main(String[] args) {
    // setting a ref to null tells the garbage collector to clean it
    Test test = new Test(7);
    meth(test); // so objects are passe by refernece
    System.out.printf("%d\n", test.x);
  }

  public static void meth(Test test) {
    test.x = 88;
    test = new Test(2);
  }
}