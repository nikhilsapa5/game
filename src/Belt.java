public class Belt extends AbstractIgear {
  private final int affectstrength;
  private final int affectconstitution;
  private final int affectdexterity;
  private final int affectcharisma;

  public Belt(String name, int affectstrength, int affectconstitution, int affectdexterity,
      int affectcharisma, int minEquipmentCount, int maxEquipmentCount,
      Size size) throws IllegalArgumentException {
    super(name, minEquipmentCount, maxEquipmentCount, size);
    this.affectstrength = affectstrength;
    this.affectconstitution = affectconstitution;
    this.affectdexterity = affectdexterity;
    this.affectcharisma = affectcharisma;
    int count = 0;
    if(affectstrength != 0) {
      count++;
    }
    if(affectconstitution != 0) {
      count++;
    }
    if(affectdexterity != 0) {
      count++;
      if (count > 2) {
        throw new IllegalArgumentException("Only two abilities can be affected.");
      }
    }
    if(affectcharisma != 0) {
      count++;
      if (count > 2) {
        throw new IllegalArgumentException("Only two abilities can be affected.");
      }
    }
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
  protected int compareFootwear(Footwear other) {
    return 1;
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
  public int getMinEquipmentCount() {
    return 1;
  }

  @Override
  public int getMaxEquipmentCount() {
    return 10;
  }

  @Override
  public Size getSize() {
    return size;
  }

  @Override
  public int compareTo(Igear o) {
    if (o instanceof AbstractIgear) {
      AbstractIgear abstractQuestion = (AbstractIgear) o;
      return abstractQuestion.compareBelt(this);
    }
    throw new IllegalArgumentException("Gears are not comparable");
  }
}
