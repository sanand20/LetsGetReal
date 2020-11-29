abstract class Number{
  public abstract double getValue();
  public boolean equals(Number other){
    double val = getValue();
    double otherval = other.getValue();
    if (val == 0 || otherval == 0){
      return (val == 0 && otherval == 0);
    }
    else{
      return Math.abs((val - otherval)/val) < (0.00001 * val);
    }
  }
  public int compareTo(Number other){
    double val = getValue();
    double otherval = other.getValue();
    if (this.equals(other)){
      return 0;
    }
    if (val>otherval){
      return 10;
    }
    return -10;
  }
}
