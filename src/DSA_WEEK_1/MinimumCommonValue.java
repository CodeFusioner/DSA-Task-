package DSA_WEEK_1;
import java.util.*;

public class MinimumCommonValue {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3};
        int [] nums2 = {2,4};
        System.out.println(getCommon(nums1,nums2));
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            if(set.contains(num)){
                return num;
            }
        }
        return -1;
    }
}
