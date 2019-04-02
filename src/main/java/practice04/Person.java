package practice04;

public class Person {
  private String name;
  private Integer age;

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String basicIntroduce() {
    return "My name is " + this.name + ". I am " + this.age + " years old.";
  }

  public String introduce() {
    return basicIntroduce();
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }
}
