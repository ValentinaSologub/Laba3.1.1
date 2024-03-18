public class Main {
    public static void main(String[] args) {
        int[] array = {7, 5, 1, 2, 4, 0, 9};

        int index = findFirstZeroIndex(array);

        // Виводимо результат
        if (index != -1) {
            System.out.println("The first null element is under the index: " + index);
        }
        else {
            System.out.println("The array does not contain null elements.");
        }
    }

    public static int findFirstZeroIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}