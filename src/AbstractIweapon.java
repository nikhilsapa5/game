public abstract class AbstractIweapon implements Iweapon {
  protected final int minDamage;
  protected final int maxDamage;

  protected AbstractIweapon(int minDamage, int maxDamage) {
    this.minDamage = minDamage;
    this.maxDamage = maxDamage;
  }
}
