package DSA_WEEK_1;
import java.util.HashMap;

public class CountElementsWithMaximumFrequency {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) +1);
        }
        int maxFreq = 0;
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq > maxFreq){
                maxFreq = freq;
            }
        }
        int totalFreq = 0;
        for(int key : map.keySet()){
            int val = map.get(key);
            if(val == maxFreq){
                totalFreq += val;
            }
        }
        return totalFreq;
    }
}
