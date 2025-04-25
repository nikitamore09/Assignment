package Assignment1;

public class Q11 {
        // Find the index of an array element

        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 3};
            int target = 3;  // Element to find
            int index = findIndex(arr, target);

            if (index != -1) {
                System.out.println("Element " + target + " is at index: " + index);
            } else {
                System.out.println("Element " + target + " is not found in the array.");
            }
        }

        public static int findIndex(int arr[], int target) {
            // Loop through the array to find the target element
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;  // Return the index of the target element
                }
            }
            return -1;  // Return -1 if the element is not found
        }
    }