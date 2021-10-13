public enum Size {
  SMALL(1),
  MEDIUM(2),
  LARGE(4);

  private final int unitsofbelt;

  Size(int unitsofbelt) {
    this.unitsofbelt = unitsofbelt;
  }

  public int getUnitsOfBelt() {
    return unitsofbelt;
  }

  @Override
  public String toString() {
    switch (this) {
      case SMALL: return "Small";
      case MEDIUM: return "Medium";
      case LARGE: return "Large";
      default: throw new IllegalArgumentException();
    }
  }
}
