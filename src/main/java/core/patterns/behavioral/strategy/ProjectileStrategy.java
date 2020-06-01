package core.patterns.behavioral.strategy;

public class ProjectileStrategy implements Strategy {


  @Override
  public void execute() {
    System.out.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
  }
}
