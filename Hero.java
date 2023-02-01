import java.util.Random;

public class Hero {
  private String name;
  private int hitPoints;
  private Random random = new Random();

  public Hero(String name) {
    this.name = name;
    this.hitPoints = 100;
  }

  public String getName() {
    return name;
  }

  public int getHitPoints() {
    return hitPoints;
  }

  public String toString() {
    return "Hero{name='" + name + "', hitPoints=" + hitPoints + "}";
  }

  public void attack(Hero opponent) {
    double randomNumber = random.nextDouble();
    if (randomNumber < 0.5) {
      opponent.hitPoints -= 10;
    } else {
      this.hitPoints -= 10;
    }
  }

  public void senzuBean() {
    hitPoints = 100;
  }

  private void fightUntilTheDeathHelper(Hero opponent) {
    while (this.hitPoints > 0 && opponent.hitPoints > 0) {
      this.attack(opponent);
    }
  }

  public String fightUntilTheDeath(Hero opponent) {
    senzuBean();
    opponent.senzuBean();
    fightUntilTheDeathHelper(opponent);
    return this.name + ": " + this.hitPoints + " \t" + opponent.getName() + ": " + opponent.getHitPoints();
  }

  private int nFightsToTheDeathHelper(Hero opponent, int n) {
    int fightsWon = 0;
    for (int i = 0; i < n; i++) {
      senzuBean();
      opponent.senzuBean();
      fightUntilTheDeathHelper(opponent);
      if (this.hitPoints > 0) {
        fightsWon++;
      }
    }
    return fightsWon;
  }

  public String nFightsToDeath(Hero opponent, int n) {
    int fightsWon = nFightsToTheDeathHelper(opponent, n);
    int fightsLost = n - fightsWon;
    if (fightsWon > fightsLost) {
      return this.name + ": " + fightsWon + " wins\n" + this.name + " wins!";
    } else if (fightsWon < fightsLost) {
      return this.name + ": " + fightsWon + " wins\n" + opponent.getName() + " wins!";
    } else {
      return this.name + ": " + fightsWon + " wins\n" + opponent.getName() + ": " + fightsLost + " wins\n" + "OMG! It was actually a draw!";
    }
  }

  public void dramaticFightToTheDeath(Hero opponent) {
    senzuBean();
    opponent.senzuBean();
    while (this.hitPoints > 0 && opponent.hitPoints > 0) {
      attack(opponent);
      System.out.println(this.name + ": " + this.hitPoints + " \t" + opponent.getName() + ": " + opponent.getHitPoints());
      try {
        Thread.sleep
