package core.patterns.behavioral.strategy;

public class MeleeStrategy implements Strategy {

  @Override
  public void execute() {
    System.out.println("With your Excalibur you sever the dragon's head!");
  }
}
