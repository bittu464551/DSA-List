package Array;
import java.util.Scanner;
/*
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
*/
public class FindMinimumInRotatedSortedArray {
    
    public int findMin(int nums[]){
        int first=0;
        int last=nums.length-1;
        while(first<=last){
            int mid=first+(last-1)/2;
            if(nums[mid]>nums[last]){
                first=mid+1;
            }
            else if(nums[mid]<nums[first]){
                last=mid-1;
            }
            else{
                return Math.min(nums[first], (last+1>=nums.length?Integer.MAX_VALUE:nums[last+1]));
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray obj=new FindMinimumInRotatedSortedArray();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int nums[]=new int[num];
        for(int i=0;i<num;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(obj.findMin(nums));
    }
}
