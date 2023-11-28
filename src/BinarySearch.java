public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 2, 3, 5, 6, 7, 9, 12, 34, 56, 78, 90 };
        int target = 78;
        System.out.println(binarySearch(array, target));
    }

    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        boolean asc;
        asc = array[start] < array[end];

        while (start <= end) {
            int middle = (start + end) / 2;

            if (array[middle] == target) {
                return middle;
            }

            if (asc) {
                if (target < array[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (target > array[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
