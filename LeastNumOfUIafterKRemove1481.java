package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
Input: arr = [4,3,1,1,3,3,2], k = 3
Output: 2
*/
public class LeastNumOfUIafterKRemove1481 {
     public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> hashmap=new HashMap();
        for(int i=0;i<arr.length;i++){
            hashmap.put(arr[i], hashmap.getOrDefault(arr[i], 0)+1);
        }
        PriorityQueue pq=new PriorityQueue(hashmap.values());
        while(k>0){
            k=k-(int)pq.poll();
        }
         
       
        return k<0?pq.size()+1:pq.size();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LeastNumOfUIafterKRemove1481 obj=new LeastNumOfUIafterKRemove1481();
        int num=sc.nextInt();
        int nums[]=new int[num];
        for(int i=0;i<num;i++){
            nums[i]=sc.nextInt();
        }
        int k =sc.nextInt();
        System.out.println(obj.findLeastNumOfUniqueInts(nums, k));
    }
 
   
}
