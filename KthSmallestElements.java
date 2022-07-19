package Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.PriorityQueue;
/*
N = 6
arr[] = 7 10 4 3 20 15
K = 3
7
*/
public class KthSmallestElements {
    public int KthSmallest(int nums[],int l,int r, int k){
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=l;i<k;i++){
            maxHeap.add(nums[i]);
        }
        for(int i=k;i<r;i++){
            
            if(nums[i]<maxHeap.peek()){
                maxHeap.poll();
                maxHeap.add(nums[i]);
            }
        }
        return (int)maxHeap.peek();
    }
    public static void main(String[] args) {
        KthSmallestElements obj=new KthSmallestElements();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int nums[]=new int[num];
        for(int i=0;i<num;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(obj.KthSmallest(nums, 0, num, k-1));
    }
    
}
