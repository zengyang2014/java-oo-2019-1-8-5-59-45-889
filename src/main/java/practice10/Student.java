package practice10;

public class Student extends Person {
  private static final String message = "I am a Student.";
  private Klass klass;

  public Student(Integer id, String name, Integer age, Klass klass) {
    super(id, name, age);

    this.klass = klass;
  }

  public String introduce() {
    String introduceMessage = super.introduce() + ' ' + message ;

    if (this.equals(klass.getLeader())) {
      introduceMessage = introduceMessage + " I am Leader of " + klass.getDisplayName() + ".";
    } else {
      introduceMessage = introduceMessage + " I am at " + this.klass.getDisplayName() + ".";
    }

    return introduceMessage;
  }

  public Klass getKlass() {
    return klass;
  }
}