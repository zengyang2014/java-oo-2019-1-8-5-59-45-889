package practice03;

public class Worker extends Person{
  private static final String message = "I am a Worker. I have a job.";

  public Worker(String name, Integer age) {
    super(name, age);
  }

  public String introduce() {
    return message;
  }
}
