public class TwoHandedSword extends AbstractSword {

  public TwoHandedSword(int minDamage, int maxDamage, Weight weight) {
    super(minDamage, maxDamage, weight);
  }

  @Override
  public int getMinDamage() {
    return 8;
  }

  @Override
  public int getMaxDamage() {
    return 12;
  }

  @Override
  public int swing() {
    return 0;
  }

  @Override
  public boolean validateEquipment(Player player) {
    return player.getStrength() > 14;
  }
}
