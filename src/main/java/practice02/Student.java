package practice02;

public class Student extends Person{
  private static final String message = "I am a Student. I am at Class ";
  private Integer klass;

  public Student(String name, Integer age, Integer klass) {
    super(name, age);

    this.klass = klass;
  }

  public String introduce() {
    return message + this.klass +".";
  }

  public Integer getKlass() {
    return klass;
  }
}
