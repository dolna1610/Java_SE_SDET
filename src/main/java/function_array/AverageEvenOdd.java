//5. Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers().

package function_array;
import java.util.Scanner;
public class AverageEvenOdd {
    public AverageEvenOdd() {
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; ++i) {
            System.out.println("Input " + (i + 1) + " :");
            array[i] = sc.nextInt();
        }

        System.out.println("The average is " + average(array));
        System.out.println("Number of Even numbers are " + countEvenNumbers(array));
        System.out.println("Number of odd numbers are " + countOddNumbers(array));
    }

    public static double average(int[] array) {
        double sum = 0.0;
        int[] var3 = array;
        int var4 = array.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            double values = (double)var3[var5];
            sum += values;
        }

        return sum / (double)array.length;
    }

    public static int countEvenNumbers(int[] array) {
        int evenNumberCount = 0;
        int[] var2 = array;
        int var3 = array.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int values = var2[var4];
            if (values % 2 == 0) {
                ++evenNumberCount;
            }
        }

        return evenNumberCount;
    }

    public static int countOddNumbers(int[] array) {
        int oddNumberCount = 0;
        int[] var2 = array;
        int var3 = array.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int values = var2[var4];
            if (values % 2 == 1) {
                ++oddNumberCount;
            }
        }

        return oddNumberCount;
    }
}
