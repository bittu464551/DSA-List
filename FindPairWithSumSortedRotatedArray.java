package Array;
import java.util.ArrayList;
import java.util.Scanner;
/*
Input: [11, 15, 26, 38, 9, 10] 35
Output: true
*/
public class FindPairWithSumSortedRotatedArray {
    public boolean pairWithSum(int arr[],int num){
        int n=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp=num-arr[i];
            if(al.contains(temp)){
                return true;
            }
            else{
                al.add(arr[i]);
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        FindPairWithSumSortedRotatedArray obj=new FindPairWithSumSortedRotatedArray();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int nums[]=new int[num];
        for(int i=0;i<num;i++){
            nums[i]=sc.nextInt();
        }
        int find=sc.nextInt();
        System.out.println(obj.pairWithSum(nums,find));
    }
}
