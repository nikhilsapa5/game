public class BroadSword extends AbstractSword {

  public BroadSword(int minDamage, int maxDamage, Weight weight) {
    super(minDamage, maxDamage, weight);
  }

  @Override
  public int getMinDamage() {
    return 6;
  }

  @Override
  public int getMaxDamage() {
    return 10;
  }

  @Override
  public int swing() {
    return 0;
  }

  @Override
  public boolean validateEquipment(Player player) {
    return true;
  }
}
