public class Axe extends AbstractIweapon {

  public Axe(int minDamage, int maxDamage) {
    super(minDamage, maxDamage);
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
