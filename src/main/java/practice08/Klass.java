package practice08;

public class Klass {
  private Number number;
  private Student leader = null;

  public Klass(Number klass) {
    this.number = klass;
  }

  public Number getNumber() {
    return number;
  }

  public String getDisplayName() {
    return "Class " + this.number;
  }

  public void assignLeader(Student leader) {
    this.leader = leader;
  }

  public Student getLeader() {
    return leader;
  }
}
