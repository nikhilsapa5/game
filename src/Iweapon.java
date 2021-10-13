public interface Iweapon {
  int getMinDamage();
  int getMaxDamage();
  int swing();
  boolean validateEquipment(Player player);
}
