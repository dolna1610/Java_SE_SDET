package function_array;

// 1. Take input from a user and check if the number exists in the array.
//Let the array is [1,3,5,7,2,4,6,8]
//Input: 7
//Output: Found in the position 3

import java.util.Scanner;

public class NumberExistsOrNot {
    public NumberExistsOrNot() {
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 7, 2, 4, 6, 8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Which number do you want to check? ");
        int element = sc.nextInt();
        int index = elementPresentOrnot(array, element);
        if (index != -1) {
            System.out.println("Found in the position " + index);
        } else {
            System.out.println("Found no element");
        }

    }

    public static int elementPresentOrnot(int[] array, int elem) {
        for(int i = 0; i < array.length; ++i) {
            if (array[i] == elem) {
                return i;
            }
        }

        return -1;
    }
}
