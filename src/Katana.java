public class Katana extends AbstractSword {

  public Katana(int minDamage, int maxDamage, Weight weight) {
    super(minDamage, maxDamage, weight);
  }

  @Override
  public int getMinDamage() {
    return 4;
  }

  @Override
  public int getMaxDamage() {
    return 6;
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
