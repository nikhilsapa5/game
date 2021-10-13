public class Potion extends AbstractIgear {
  private final int affectstrength;
  private final int affectconstitution;
  private final int affectdexterity;
  private final int affectcharisma;

  public Potion(String name, int affectstrength, int affectconstitution, int affectdexterity,
      int affectcharisma, int minEquipmentCount, int maxEquipmentCount,
      Size size) throws IllegalArgumentException {
    super(name, minEquipmentCount, maxEquipmentCount, size);
    this.affectstrength = affectstrength;
    this.affectconstitution = affectconstitution;
    this.affectdexterity = affectdexterity;
    this.affectcharisma = affectcharisma;
  }

  @Override
  public int getAffectStrength() {
    return this.affectstrength;
  }

  @Override
  public int getAffectConstitution() {
    return this.affectconstitution;
  }

  @Override
  public int getAffectDexterity() {
    return this.affectdexterity;
  }

  @Override
  public int getAffectCharisma() {
    return this.affectcharisma;
  }

  @Override
  protected int compareHeadgear(Headgear other) {
    return -1;
  }

  @Override
  protected int comparePotion(Potion other) {
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
    return Integer.MAX_VALUE;
  }

  @Override
  public Size getSize() {
    return null;
  }

  @Override
  public int compareTo(Igear o) {
    if (o instanceof AbstractIgear) {
      AbstractIgear abstractQuestion = (AbstractIgear) o;
      return abstractQuestion.comparePotion(this);
    }
    throw new IllegalArgumentException("Gears are not comparable");
  }
}
