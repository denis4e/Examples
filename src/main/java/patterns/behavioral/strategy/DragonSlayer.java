package patterns.behavioral.strategy;

public class DragonSlayer {

  private Strategy strategy;

  public DragonSlayer(Strategy strategy) {
    this.strategy = strategy;
  }

  public void changeStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public void goToBattle() {
    strategy.execute();
  }
}
