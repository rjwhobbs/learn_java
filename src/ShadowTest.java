package src;

public class ShadowTest {

  public int x = 50;

  class FirstLevel {

      public int x = 1;
      // Shadowing
      void methodInFirstLevel(int x) {
          System.out.println("x = " + x);
          System.out.println("this.x = " + this.x);
          System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
      }
  }

  public static void main(String... args) {
      ShadowTest st = new ShadowTest();
      // Creating the FL object
      ShadowTest.FirstLevel fl = st.new FirstLevel();
      fl.methodInFirstLevel(23);
  }
}