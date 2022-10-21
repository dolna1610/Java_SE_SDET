package function_array;

//2. Input an amount from the user and find out the number of notes from input amount in given array
//[1000,500,100,50,20,10,5,2,1].
//Input: 1256
//
//Output:
//1000 1
//100 2
//50 1
//2 3

import java.util.Scanner;

public class NumberOfNotes {
    public NumberOfNotes() {
    }

    public static void main(String[] args) {
        int[] array = new int[]{1000, 500, 100, 50, 20, 10, 5, 2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of money: ");
        int amount = sc.nextInt();
        if (amount > 1) {
            notesRequired(array, amount);
        } else {
            System.out.println("Invalid amount entered! Give valid amount");
        }

    }

    public static void notesRequired(int[] array, int amount) {
        int count = 0;
        int[] var3 = array;
        int var4 = array.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int notes = var3[var5];
            if (notes <= amount) {
                while(notes <= amount) {
                    amount -= notes;
                    ++count;
                }

                if (amount == 1) {
                    amount += notes * count;
                    count = 0;
                } else {
                    System.out.println(notes + " " + count);
                    count = 0;
                }
            }
        }

    }
}

