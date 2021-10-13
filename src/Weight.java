public enum Weight {
  LIGHT,
  MEDIUM,
  HEAVY;

  @Override
  public String toString() {
    switch (this) {
      case LIGHT: return "Light";
      case MEDIUM: return "Medium";
      case HEAVY: return "Heavy";
      default: throw new IllegalArgumentException();
    }
  }
}
