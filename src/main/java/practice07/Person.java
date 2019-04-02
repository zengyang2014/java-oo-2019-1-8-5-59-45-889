package practice07;

public class Person {
  private String name;
  private Integer age;

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String introduce() {
    return "My name is " + this.name + ". I am " + this.age + " years old.";
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }
}
