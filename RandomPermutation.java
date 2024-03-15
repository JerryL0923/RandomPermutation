import java.util.Arrays;
import java.util.Random;

public class RandomPermutation {
    public static void main(String[] args) {

      int p[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

      int r[] = new int[p.length];

      for (int i = 0; i < p.length; i++) {
        int index = next(p);
        r[i] = p[index];
        p = removeElement(p, index);
      }

      System.out.println(Arrays.toString(r));
    }

    
    
    
    
    
    public static int next(int p[]) {
      return new Random().nextInt(p.length);
    }

    public static int[] removeElement(int[] array, int index) {
      int[] newArray = new int[array.length];
      System.arraycopy(array, 0, newArray, 0, index);
      System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
      newArray[newArray.length - 1] = 0; // Add this line to set the last element to 0
      System.out.println(java.util.Arrays.toString(newArray));
      return newArray;
  }
}