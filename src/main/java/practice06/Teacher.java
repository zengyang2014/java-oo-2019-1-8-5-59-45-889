package practice06;

public class Teacher extends Person {
  private static final String ownClassMessage = " I am a Teacher. I teach Class ";
  private static final String noClassMessage = " I am a Teacher. I teach No Class.";

  private Integer klass;

  public Teacher(String name, Integer age) {
    super(name, age);
  }

  public Teacher(String name, Integer age, Integer klass) {
    super(name, age);

    this.klass = klass;
  }

  public String introduce() {
    String introduceMessage = super.introduce();

    if (klass == null) {
      introduceMessage += noClassMessage;
    } else {
      introduceMessage = introduceMessage + ownClassMessage + this.klass + ".";
    }

    return introduceMessage;
  }

  public Integer getKlass() {
    return this.klass;
  }
}
