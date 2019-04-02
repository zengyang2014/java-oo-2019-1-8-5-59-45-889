package practice09;

public class Person {
  private Integer id;
  private String name;
  private Integer age;

  public Person(Integer id, String name, Integer age) {
    this.id = id;
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

  private Integer getId() { return id; }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Person)
      return id.equals(((Person)obj).getId());
    else
      return false;
  }
}
