import java.util.Random;

public class RandomUtil  extends Random {
  public static int randomIntGenerator(int min, int max, Random r) {
    return r.nextInt(max - 1) + min;
  }
}
