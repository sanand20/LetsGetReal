public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  /*
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(RealNumber other){
    double val = getValue();
    double otherval = other.getValue();
    if (val == 0 || otherval == 0){
      return (val == 0 && otherval == 0);
    }
    else{
      return Math.abs((val - otherval)/val) < (0.00001 * val);
    }
  }

  /*
  *Return a new RealNumber that has the value of:
  *the sum of this and the other
  */
  public RealNumber add(RealNumber other){
    double sum = other.getValue()+getValue();
    RealNumber ans = new RealNumber(sum);
    return (ans);
  }

  /*
  *Return a new RealNumber that has the value of:
  *the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
    double product = other.getValue() * getValue();
    RealNumber ans = new RealNumber(product);
    return (ans);
  }

  /*
  *Return a new RealNumber that has the value of:
  *this divided by the other
  */
  public RealNumber divide(RealNumber other){
    double quotient = getValue() / other.getValue();
    RealNumber ans = new RealNumber(quotient);
    return (ans);
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other
  */
  public RealNumber subtract(RealNumber other){
    return null;
  }
}
