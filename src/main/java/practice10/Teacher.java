package practice10;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person {
  private static final String teacherMessage = " I am a Teacher. ";
  private static final String ownClassMessage = " I am a Teacher. I teach Class";
  private static final String noClassMessage = " I am a Teacher. I teach No Class.";


  private LinkedList<Klass> classes = new LinkedList<>();

  public Teacher(Integer id, String name, Integer age) {
    super(id, name, age);
  }

  public Teacher(Integer id, String name, Integer age, LinkedList<Klass> classes) {
    super(id, name, age);


    this.classes = classes;
  }

  public String introduce() {
    StringBuilder introduceMessage = new StringBuilder(super.introduce());

    if (classes.isEmpty()) {
      introduceMessage.append(noClassMessage);
    } else {
      introduceMessage.append(ownClassMessage);

      for (Klass klass: classes) {
        introduceMessage.append(" " + klass.getNumber() + ",");
      }
      introduceMessage = new StringBuilder(introduceMessage.substring(0, introduceMessage.length() - 1) + ".");
    }

    return introduceMessage.toString();
  }

  String introduceWith(Student student) {
    String introduceMessage = super.introduce() + teacherMessage;

    if(isTeaching(student)) {
      introduceMessage = introduceMessage + "I teach " + student.getName() + ".";
    } else {
      introduceMessage = introduceMessage + "I don't teach " + student.getName() + ".";
    }

    return introduceMessage;
  }

  Boolean isTeaching(Student student) {
    return classes.contains(student.getKlass());
  }

  List<Klass> getClasses() {
    return classes;
  }
}
