package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
  private Number number;
  private Student leader = null;
  private List<Student> classMember;
  private Teacher teacher;

  public Klass(Number klass) {
    this.number = klass;
    classMember = new ArrayList<>();
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public Number getNumber() {
    return number;
  }

  public String getDisplayName() {
    return "Class " + this.number;
  }

  void assignLeader(Student leader) {
    if(isIn(leader)) {
      this.leader = leader;

      if(teacher != null)
        teacher.triggerConfirmOfLeader(leader, number);
    } else {
      System.out.print("It is not one of us.\n");
    }
  }

  public Student getLeader() {
    return leader;
  }

  public Boolean isIn(Student student) {
    return classMember.contains(student);
  }

  void appendMember(Student student) {
    if(teacher != null)
      teacher.triggerConfirmOfClassMember(student, number);

    student.setKlass(this);
    classMember.add(student);
  }
}
