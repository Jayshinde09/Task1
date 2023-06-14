public class Duplicate {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 5, 3, 4, 5, 7, 9, 9, 3 };
        System.out.println("Duplicate elements in given array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
