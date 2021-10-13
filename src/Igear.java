public interface Igear extends Comparable<Igear> {
  String getName();

  int getAffectStrength();

  int getAffectConstitution();

  int getAffectDexterity();

  int getAffectCharisma();

  int getMinEquipmentCount();

  int getMaxEquipmentCount();

  Size getSize();
}
