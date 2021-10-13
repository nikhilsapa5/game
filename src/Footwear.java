public class Footwear extends AbstractIgear {
  private final int affectdexterity;

  protected Footwear(String name, int affectdexterity, int minEquipmentCount, int maxEquipmentCount,
      Size size) throws IllegalArgumentException {
    super(name, minEquipmentCount, maxEquipmentCount, size);
    this.affectdexterity = affectdexterity;
  }

  @Override
  protected int compareHeadgear(Headgear other) {
    return -1;
  }

  @Override
  protected int comparePotion(Potion other) {
    return -1;
  }

  @Override
  protected int compareBelt(Belt other) {
    return -1;
  }

  @Override
  protected int compareFootwear(Footwear other) {
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
  public int getAffectStrength() {
    return 0;
  }

  @Override
  public int getAffectConstitution() {
    return 0;
  }

  @Override
  public int getAffectDexterity() {
    return this.affectdexterity;
  }

  @Override
  public int getAffectCharisma() {
    return 0;
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
      return abstractQuestion.compareFootwear(this);
    }
    throw new IllegalArgumentException("Gears are not comparable");
  }
}
