package DSA_WEEK_1;

public class LemonadeChange {
    public static void main(String[] args) {
        int [] bills = {5,5,5,10,20};
        System.out.println(lemonadeChange(bills));
    }
    public static boolean lemonadeChange(int[] bills) {
        int sum5 = 0, sum10 = 0 ;
        for(int i =0;i<bills.length;i++){
            if(bills[i] == 5){
                sum5++;
            }
            else if(bills[i] == 10){
                if(sum5>0){
                    sum5--;
                    sum10++;
                }else{
                    return false;
                }
            }else{
                if(sum5 > 0 && sum10 > 0){
                    sum5--;
                    sum10--;
                }else if(sum5 >= 3){
                    sum5 = sum5-3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
