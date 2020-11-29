public class RationalNumber extends Number
{
  private int numerator;
  private int denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *  If the denominator is negative, negate both numerator and denominator
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    if (deno == 0){
      numerator = 0;
      denominator = 1;
    }
    else if (deno < 0){
      numerator = (-1 *nume);
      denominator = (-1 * deno);
    }
    else {
       numerator = nume;
       denominator = deno;
    }
  }

  public double getValue(){
    return (double)numerator/(double)denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    int newnum = denominator;
    int newden = numerator;
    numerator = newnum;
    denominator = newden;
    RationalNumber ans = new RationalNumber (numerator, denominator);
    return (ans);
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  /***
  public boolean equals(RationalNumber other){
    this.reduce();
    other.reduce();
    double num = getNumerator();
    double den = getDenominator();
    double othernum = other.getNumerator();
    double otherden = other.getDenominator();
    return ((num == othernum) && (den == otherden));
  }
***/

  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    this.reduce();
    if (numerator == 0 || denominator==1){
      return "" + numerator;
    }
    return "" + numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    int x = 0;
    int r = 10;
    int gcd = 1;
    if (a<b){
      int c = b;
      b = a;
      a = c;
    }
    while (r>0){
      gcd = b;
      x = a/b;
      r = a-(x*b);
      a = b;
      b = r;
    }
    return gcd;

  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
    numerator = numerator/gcd;
    denominator = denominator/gcd;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int num = getNumerator();
    int den = getDenominator();
    int othernum = other.getNumerator();
    int otherden = other.getDenominator();
    int ansnumerator = (num * othernum);
    int ansdenominator = (den * otherden);
    RationalNumber ans = new RationalNumber(ansnumerator, ansdenominator);
    ans.reduce();
    return ans;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    int num = getNumerator();
    int den = getDenominator();
    int othernum = other.getNumerator();
    int otherden = other.getDenominator();
    int ansnumerator = (num * othernum);
    int ansdenominator = (den * otherden);
    RationalNumber ans = new RationalNumber(ansnumerator, ansdenominator);
    ans.reduce();
    return ans;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int num = getNumerator();
    int den = getDenominator();
    int othernum = other.getNumerator();
    int otherden = other.getDenominator();
    int ansnumerator = (num * otherden + den * othernum);
    int ansdenominator = (den * otherden);
    RationalNumber ans = new RationalNumber(ansnumerator, ansdenominator);
    ans.reduce();
    return ans;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int num = getNumerator();
    int den = getDenominator();
    int othernum = other.getNumerator();
    int otherden = other.getDenominator();
    int ansnumerator = (num * otherden - den * othernum);
    int ansdenominator = (den * otherden);
    RationalNumber ans = new RationalNumber(ansnumerator, ansdenominator);
    ans.reduce();
    return ans;
  }
}
