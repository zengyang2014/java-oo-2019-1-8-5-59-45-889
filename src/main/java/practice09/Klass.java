package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
  private Number number;
  private Student leader = null;
  private List<Student> classMember;

  public Klass(Number klass) {
    this.number = klass;
    classMember = new ArrayList<>();
  }

  public Number getNumber() {
    return number;
  }

  public String getDisplayName() {
    return "Class " + this.number;
  }

  void assignLeader(Student leader) {
    if(leader.getKlass().number.equals(this.number)) {
      this.leader = leader;
    }
    else
      System.out.print("It is not one of us.\n");
  }

  public Student getLeader() {
    return leader;
  }

  void appendMember(Student student) {
    classMember.add(student);
  }
}