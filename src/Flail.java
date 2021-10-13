public class Flail extends AbstractIweapon {

  public Flail(int minDamage, int maxDamage) {
    super(minDamage, maxDamage);
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
    return player.getDexterity() > 14;
  }
}
