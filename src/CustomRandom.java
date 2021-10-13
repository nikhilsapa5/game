import java.util.Random;

public class CustomRandom extends Random {
  @Override
  public int nextInt(int number) {
    return 4;
  }
}
