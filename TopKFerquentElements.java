package Array;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
*/
public class TopKFerquentElements {
    public int[] topKFerquent(int nums[],int k){
        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
        
        for(int i:nums){
            hashMap.put(i, hashMap.getOrDefault(i, 0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        
        for(Map.Entry entry: hashMap.entrySet()){
            pq.add(entry);
        }
        
        int[] output=new int[k];
        for(int i=0;i<k;i++){
            output[i]=pq.poll().getKey();
        }
        
        System.out.println(hashMap);
        return output;
    }
    public static void main(String[] args) {
        TopKFerquentElements obj=new TopKFerquentElements();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int nums[]=new int[num];
        for(int i=0;i<num;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int arr[]=obj.topKFerquent(nums,k);
        for(int i=0;i<k;i++){
            System.out.println(arr[i]);
        }
    }
}
