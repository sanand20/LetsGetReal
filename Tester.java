public class Tester{
  public static void main(String[] args) {
    RationalNumber test = new RationalNumber(3,4);
    RationalNumber test2 = new RationalNumber(6,5);
    System.out.println(test.add(test2).toString());
    System.out.println(test.getValue());
    System.out.println(test.getNumerator());
    System.out.println(test.getDenominator());
    System.out.println(test.divide(test2).toString());
    System.out.println(test.add(test2).toString());
    System.out.println(test.subtract(test2).toString());






  /*  RealNumber test = new RealNumber(-2.2);
    RealNumber test2 = new RealNumber(4.5);
    System.out.println(test.equals(test2));
    System.out.println(test.add(test2));
    System.out.println(test.multiply(test2));
    System.out.println(test.multiply(test2));
    System.out.println(test.divide(test2));
    System.out.println(test.subtract(test2));
*/
  }
}
