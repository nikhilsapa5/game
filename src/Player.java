import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player implements Iplayer {
  private Random r;
  private List<Igear> equippedGear = new ArrayList<>();
  private int strength;
  private int constitution;
  private int dexterity;
  private int charisma;
  private int health;
  private Iweapon weapon;

  public Player() {
    this(new Random());
  }

  public Player(Random r) {
    this.r = r;
    this.strength = setAbilityValue();
    this.constitution = setAbilityValue();
    this.dexterity = setAbilityValue();
    this.charisma = setAbilityValue();
    this.health = this.strength + this.constitution + this.dexterity + this.charisma;
    this.weapon = weapon;
  }

  private int setAbilityValue() {
    int min = 6;
    int result = 0;
    for(int i = 0; i < 4; i++) {
      int rand = RandomUtil.randomIntGenerator(2, 6, r);
      if(rand < min) {
        min = rand;
      }
      result += rand;
    }
    return result - min;
  }

  @Override
  public int getStrength() {
    return this.strength;
  }

  @Override
  public int getConstitution() {
    return this.constitution;
  }

  @Override
  public int getDexterity() {
    return this.dexterity;
  }

  @Override
  public int getCharisma() {
    return this.charisma;
  }

  @Override
  public int getRemainingHealth() {
    return this.health;
  }

  @Override
  public void setStrength(int strength) {
    this.strength = strength;
  }

  @Override
  public void setConstitution(int constitution) {
    this.constitution = constitution;
  }

  @Override
  public void setDexterity(int dexterity) {
    this.dexterity = dexterity;
  }

  @Override
  public void setCharisma(int charisma) {
    this.charisma = charisma;
  }
}
