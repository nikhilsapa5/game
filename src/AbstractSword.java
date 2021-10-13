public abstract class AbstractSword extends AbstractIweapon {
  protected final Weight weight;
  public AbstractSword(int minDamage, int maxDamage, Weight weight) {
    super(minDamage, maxDamage);
    this.weight = weight;
  }
}
