import java.util.Arrays;

public class Q61 {
    public static boolean checkPermutation(char[] array1, int size1, char[] array2,
                                           int size2) {
        if (size1 != size2) {
            return false;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < size1; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;

    }
}
