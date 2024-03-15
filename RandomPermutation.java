import java.util.Arrays;
import java.util.Random;

public class RandomPermutation {
    public static void main(String[] args) {

        int pLength = 10;
        int p[] = new int[pLength];
        for (int i = 0; i < pLength; i++) {
            p[i] = i + 1;
        }

        int r[] = new int[pLength];

        for (int i = 0; i < pLength; i++) {
            int index = next(p, pLength - i);
            r[i] = p[index];
            p = removeElement(p, index);
        }

        System.out.println(Arrays.toString(r));
    }

    public static int next(int p[], int length) {
        return new Random().nextInt(length);
    }

    public static int[] removeElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }
}
