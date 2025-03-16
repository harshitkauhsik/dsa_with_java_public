import java.util.Scanner;

class Array {
    int size = 0;
    int arr[];
    Scanner s1 = new Scanner(System.in);

    int array_operation() {
        System.out.print("Enter the size of the array: ");
        size = s1.nextInt();
        arr = new int[size];  // Initialize instance variable
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + (i + 1) + " Element:");
            arr[i] = s1.nextInt();
        }

        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + (i < size - 1 ? " --> " : ""));
        }
        System.out.println();
        return 0;
    }

    int searchlinear() {
        System.out.print("Enter the key to search: ");
        int key = s1.nextInt();

        for (int i = 0; i < size; i++) {
            if (key == arr[i]) {
                System.out.println("Element " + key + " found at index: " + i);
                return i;
            }
        }

        System.out.println("Element not found.");
        return -1;
    }

    public static void main(String[] args) {
        Array a1 = new Array();
        a1.array_operation();
        a1.searchlinear();
    }
}
