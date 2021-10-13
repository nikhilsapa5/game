import java.util.Objects;

public abstract class AbstractIgear implements Igear {
  private final String name;
  private final int minEquipmentCount;
  private final int maxEquipmentCount;
  protected final Size size;

  protected AbstractIgear(String name, int minEquipmentCount, int maxEquipmentCount, Size size)
      throws IllegalArgumentException {
    this.name = name;
    this.minEquipmentCount = minEquipmentCount;
    this.maxEquipmentCount = maxEquipmentCount;
    this.size = size;
  }

  @Override
  public String getName() {
    return this.name;
  }

  /**
   * Determine whether this gear is equal to a headgear object.
   *
   * @param other the headgear object to which this gear must be compared
   */
  protected abstract int compareHeadgear(Headgear other);

  /**
   * Determine whether this gear is equal to a potion object.
   *
   * @param other the potion object to which this gear must be compared
   */
  protected abstract int comparePotion(Potion other);

  /**
   * Determine whether this gear is equal to a belt object.
   *
   * @param other the belt object to which this gear must be compared
   */
  protected abstract int compareBelt(Belt other);

  /**
   * Determine whether this gear is equal to a footwear object.
   *
   * @param other the footwear object to which this gear must be compared
   */
  protected abstract int compareFootwear(Footwear other);

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractIgear that = (AbstractIgear) o;
    return minEquipmentCount == that.minEquipmentCount
        && maxEquipmentCount == that.maxEquipmentCount
        && Objects.equals(name, that.name) && size == that.size;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, minEquipmentCount, maxEquipmentCount, size);
  }
}
