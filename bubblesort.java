public class bubblesort {
    public static void main(String[] args) {
        int arr[] = { 7, 6, 4, 3, 1 };
        // int arr[] = {1,2,3,4,5};

        boolean alreadySorted = false;

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                alreadySorted = true;
                break;
            }
        }

        if (alreadySorted) {
            System.out.println("Array is already sorted!");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Sorted array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
