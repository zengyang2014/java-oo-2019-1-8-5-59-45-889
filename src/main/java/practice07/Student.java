package practice07;

public class Student extends Person {
  private static final String message = "I am a Student. I am at ";
  private Klass klass;

  public Student(String name, Integer age, Klass klass) {
    super(name, age);

    this.klass = klass;
  }

  public String introduce() {
    return super.introduce() + ' ' + message + this.klass.getDisplayName() +".";
  }

  public Klass getKlass() {
    return klass;
  }
}
