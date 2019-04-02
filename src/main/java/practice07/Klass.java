package practice07;

public class Klass {
  private Number number;

  public Klass(Number klass) {
    this.number = klass;
  }

  public Number getNumber() {
    return number;
  }

  public String getDisplayName() {
    return "Class " + this.number;
  }
}
