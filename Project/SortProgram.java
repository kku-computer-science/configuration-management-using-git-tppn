import java.util.Arrays;
import java.util.Scanner;

public class SortProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integers to sort (space separated): ");
        String[] input = sc.nextLine().trim().split(" ");
        int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        System.out.print("Choose algorithm (quick / bubble): ");
        String algo = sc.nextLine().trim().toLowerCase();

        switch (algo) {
            case "quick":
                quickSort(arr, 0, arr.length - 1);
                break;

            case "bubble":
                bubbleSort(arr);
                break;

            default:
                System.out.println("Invalid algorithm! Please choose 'quick' or 'bubble'.");
                return;
        }

        System.out.println("Sorted result: " + Arrays.toString(arr));
    }
    
     // ----------------- Quick Sort -----------------
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


}
