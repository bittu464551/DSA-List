package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
*/
public class Sum3 {
     public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> output_arr=new LinkedList();
        
        for(int i=0;i<nums.length;i++){
         if(i==0||(i>0 && nums[i]!=nums[i-1])){
             int low=i+1;
             int high=nums.length-1;
             int sum=0-nums[i];
             
             while(low<high){
                 if(nums[low]+nums[high]==sum){
                     output_arr.add(Arrays.asList(nums[i],nums[low],nums[high]));
                     while(low<high && nums[low]==nums[low+1])low++;
                    while(low<high && nums[high]==nums[high-1])high++;
                     low++;
                     high--;
                     
                 }
                 else if(nums[low]+nums[high]>sum){
                     high--;
                 }
                 else{
                     low++;
                 }
             }
            }
        }
        return output_arr;
    }
    public static void main(String[] args) {
        Sum3 obj=new Sum3();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int nums[]=new int[num];
        for(int i=0;i<num;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(obj.threeSum(nums));
    }
}
