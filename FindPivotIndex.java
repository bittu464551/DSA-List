package Array;
import java.util.Scanner;
/*
Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {

        int left_sum=0;
        int right_sum=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            right_sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(left_sum==right_sum-nums[index]){
                return index;
            }
            else{
                left_sum+=nums[index];
                right_sum-=nums[index];
                index++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FindPivotIndex obj=new FindPivotIndex();
        int num=sc.nextInt();
        int nums[]=new int[num];
        for(int i=0;i<num;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(obj.pivotIndex(nums));
    }
}
