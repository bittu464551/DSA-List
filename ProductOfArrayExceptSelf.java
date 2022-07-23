package Array;
import java.util.Scanner;
/*
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
*/
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int nums[]){
        int n=nums.length;
        int left_products[]=new int[n];
        int right_products[]=new int[n];
        
        int output_arr[]=new int[n];
        
        left_products[0]=1;
        right_products[n-1]=1;
        
        for(int i=1;i<n;i++){
            left_products[i]=left_products[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right_products[i]=right_products[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            output_arr[i]=left_products[i]*right_products[i];
        }
        return output_arr;
        /*
        TLE Error
        int product;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            product=1;
            for(int j=0;j<nums.length;j++){           
                if(j!=i){
                   product*=nums[j]; 
                }
            }
            arr[i]=product;
        }
        return arr;*/
    }
    public static void main(String[] args) {
        ProductOfArrayExceptSelf obj=new ProductOfArrayExceptSelf();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int nums[]=new int[num];
        for(int i=0;i<num;i++){
            nums[i]=sc.nextInt();
        }
        int arr[]=obj.productExceptSelf(nums);
        System.out.println();
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
