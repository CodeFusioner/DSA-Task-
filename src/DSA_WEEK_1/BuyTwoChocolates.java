package DSA_WEEK_1;
import java.util.*;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        int [] prices = {3,2,3};
        int money = 3;
        System.out.println(buyChocolates(prices,money));
    }
    public static int buyChocolates(int[] price, int money) {
        Arrays.sort(price);
        int p1 = price[0];
        int p2 = price[1];
        int sum = p1 + p2;
        if(sum <= money){
            return money - sum;
        }else{
            return money;
        }
    }
}
