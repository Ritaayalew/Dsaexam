
package question6;
public class Arraymanipulation {
    public static int[] deleteElement(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            System.out.println("Invalid index.");
            return arr;
        }

        int[] result = new int[arr.length - 1];
        int k = 0;


        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                result[k++] = arr[i];
            }
        }

        return result;
    }
}



