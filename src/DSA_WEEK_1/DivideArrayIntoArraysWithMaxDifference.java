package DSA_WEEK_1;
import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
    public static void main(String[] args) {
        int [] nums = {1,3,4,8,7,9,3,5,1};
        int k = 2;
        int [][] arr = divideArray(nums , k);
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int [][] arr = new int[nums.length / 3][3];
        int idx = 0;
        for(int i = 0;i<nums.length;i+=3){
            int first = nums[i];
            int second = nums[i+1];
            int third = nums[i+2];
            if(third - first <= k){
                arr[idx][0] = first;
                arr[idx][1] = second;
                arr[idx][2] = third;
                idx++;
            }else{
                return new int [0][0];
            }
        }
        return arr;
    }
}
