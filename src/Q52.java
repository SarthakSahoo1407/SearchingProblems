public class Q52 {
    public static int findMedian(int[] arrFirst, int sizeFirst, int[] arrSecond, int
            sizeSecond) {
        int medianIndex = ((sizeFirst + sizeSecond) + (sizeFirst + sizeSecond) % 2) / 2;
        int i = 0, j = 0;
        int count = 0;
        while (count < medianIndex - 1) {
            if (i < sizeFirst - 1 && arrFirst[i] < arrSecond[j]) {
                i++;
            } else {
                j++;
            }
            count++;
        }
        if (arrFirst[i] < arrSecond[j]) {
            return arrFirst[i];
        } else {
            return arrSecond[j];
        }
    }
    public static void main(String[] args) {
        int[] arrFirst = { 1, 12, 15, 26, 38 };
        int[] arrSecond = { 2, 13, 17, 30, 45 };
        int sizeFirst = arrFirst.length;
        int sizeSecond = arrSecond.length;
        System.out.println(findMedian(arrFirst, sizeFirst, arrSecond, sizeSecond));
    }
}
