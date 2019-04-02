package practice08;

public class Teacher extends Person {
  private static final String teacherMessage = " I am a Teacher. ";
  private static final String ownClassMessage = " I am a Teacher. I teach ";
  private static final String noClassMessage = " I am a Teacher. I teach No Class.";

  private Klass klass;

  public Teacher(Integer id, String name, Integer age) {
    super(id, name, age);
  }

  public Teacher(Integer id, String name, Integer age, Klass klass) {
    super(id, name, age);

    this.klass = klass;
  }

  public String introduce() {
    String introduceMessage = super.introduce();

    if (klass == null) {
      introduceMessage += noClassMessage;
    } else {
      introduceMessage = introduceMessage + ownClassMessage + this.klass.getDisplayName() + ".";
    }

    return introduceMessage;
  }

  public String introduceWith(Student student) {
    String introduceMessage = super.introduce() + teacherMessage;

    if(student.getKlass().getNumber().equals(this.klass.getNumber())) {
      introduceMessage = introduceMessage + "I teach " + student.getName() + ".";
    } else {
      introduceMessage = introduceMessage + "I don't teach " + student.getName() + ".";
    }

    return introduceMessage;
  }

  public Klass getKlass() {
    return this.klass;
  }
}
