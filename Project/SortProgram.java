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

}
