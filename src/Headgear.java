public class Headgear extends AbstractIgear {
  private final int affectconstitution;

  public Headgear(String name, int affectconstitution, int minEquipmentCount, int maxEquipmentCount,
      Size size) throws IllegalArgumentException {
    super(name, minEquipmentCount, maxEquipmentCount, size);
    this.affectconstitution = affectconstitution;
  }

  @Override
  public int getAffectStrength() {
    return 0;
  }

  @Override
  public int getAffectConstitution() {
    return this.affectconstitution;
  }

  @Override
  public int getAffectDexterity() {
    return 0;
  }

  @Override
  public int getAffectCharisma() {
    return 0;
  }

  @Override
  protected int compareHeadgear(Headgear other) {
    int temp = this.getName().compareTo(other.getName());
    if (temp < 0) {
      return 1;
    } else if (temp > 0) {
      return -1;
    } else {
      return 0;
    }
  }

  @Override
  protected int comparePotion(Potion other) {
    return 1;
  }

  @Override
  protected int compareBelt(Belt other) {
    return 1;
  }

  @Override
  protected int compareFootwear(Footwear other) {
    return 1;
  }

  @Override
  public int getMinEquipmentCount() {
    return 1;
  }

  @Override
  public int getMaxEquipmentCount() {
    return 1;
  }

  @Override
  public Size getSize() {
    return null;
  }

  @Override
  public int compareTo(Igear o) {
    if (o instanceof AbstractIgear) {
      AbstractIgear abstractQuestion = (AbstractIgear) o;
      return abstractQuestion.compareHeadgear(this);
    }
    throw new IllegalArgumentException("Gears are not comparable");
  }
}
