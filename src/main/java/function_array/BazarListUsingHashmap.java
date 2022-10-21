package function_array;

//4. Create your todays bazar list/pocket expenditure which includes the item name and price. Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price. If found no item, then print message as "No item found" and create another function named totalSum() which will return total price of items.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class BazarListUsingHashmap {
    public BazarListUsingHashmap() {
    }

    public static void main(String[] args) {
        HashMap<String, Integer> bazarList = new HashMap();
        bazarList.put("Eggs", 120);
        bazarList.put("Chicken", 300);
        bazarList.put("Meat", 1400);
        bazarList.put("Oil", 500);
        bazarList.put("Salt", 80);
        bazarList.put("Sugar", 60);
        bazarList.put("Vegetables", 150);
        Scanner sc = new Scanner(System.in);
        System.out.println("Which item do you want to search?");
        String item = sc.next();

        int totalPrice;
        try {
            totalPrice = searchItem(bazarList, item);
            System.out.println("The price of the searched item is " + totalPrice);
        } catch (Exception var5) {
            System.out.println("No item found");
        }

        totalPrice = totalSum(bazarList);
        System.out.println("The total price of items is " + totalPrice);
    }

    public static int searchItem(HashMap<String, Integer> bazarList, String item) {
        return (Integer)bazarList.get(item);
    }

    public static int totalSum(HashMap<String, Integer> bazarList) {
        int sum = 0;

        int price;
        for(Iterator var2 = bazarList.values().iterator(); var2.hasNext(); sum += price) {
            price = (Integer)var2.next();
        }

        return sum;
    }
}
