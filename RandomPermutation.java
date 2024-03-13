import java.util.Random;

public class RandomPermutation {
  public static next() {
    int[] defaultNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
    int[] finalNumbers = new int[10]; 
    Random random = new Random();

    for (int i = 0; i < defaultNumbers.length; i++){ 
      int randomInt = random.nextInt(10) + 1;
      if (finalNumbers[i] != 0) {
        finalNumbers[i] = defaultNumbers[randomInt]; 
      }
      System.out.println(java.util.Arrays.toString(r));
    }
  }
}