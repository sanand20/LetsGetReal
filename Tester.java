public class Tester{
  public static void main(String[] args) {
    RealNumber test = new RealNumber(-2.2);
    RealNumber test2 = new RealNumber(4.5);
    System.out.println(test.equals(test2));
    System.out.println(test.add(test2));
    System.out.println(test.multiply(test2));

  }
}
