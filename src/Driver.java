import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
  public static void main(String args[]) {
    List<Igear> igear = new ArrayList<>();
    igear.add(new Headgear("Head1", 2,1,1, null));
    igear.add(new Headgear("Armhead1", 2,1,1, null));
    igear.add(new Belt("belt1", 2,2,0, 0,1,1,Size.SMALL));
    igear.add(new Potion("potion1", 2,2,-4, -5,1,3,null));
    igear.add(new Headgear("Armhead1", 2,1,1, null));
    igear.add(new Headgear("Head1", 2,1,1, null));
    igear.add(new Headgear("Armhead1", 2,1,1, null));
    Collections.sort(igear);
    for(Igear g : igear) {
      System.out.println(g.getName());
    }
  }
}
