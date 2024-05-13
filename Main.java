package question1;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to store: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search for: ");
        int searchValue = scanner.nextInt();

        int count = 0;
        for (int value : array) {
            if (value == searchValue) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(searchValue + " is present in the array.");
            System.out.println(" It appears " + count + " times.");
        } else {
            System.out.println(searchValue + " is not present in the array.");
        }

    }
}