package java_condition_loop_problem_solution;
//10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.
//Input:
//23
//54
//12
//21
//67
//98
//q
//Output:
//The largest number is: 98
//The smallest number is: 12

import java.util.Scanner;
public class LargestSmallestNumbers {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            //saving first input as min and max
            System.out.println("Enter the first number:");
            int number=sc.nextInt();
            int max=number;
            int min=number;
            //looping till user hits "End"
            while (true){
                System.out.println("Give input as a number:\n" +
                        "if stop Press \"End\"");
                if(sc.hasNextInt()){
                    int num= sc.nextInt();
                    if (num>max){
                        max=num;
                    }
                    else{
                        min=num;
                    }
                }
                else{
                    String s=sc.next();
                    System.out.println("Input printed "+s);
                    if(s.equals("End")){
                        break;
                    }
                }
            }
            System.out.println("The largest number is "+max);
            System.out.println("The smallest number is "+min);

        }
    }
