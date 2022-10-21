//5. Write a program to sum of numbers which only divisible by 5 from 1 to 100
package java_condition_loop_problem_solution;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%5==0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}