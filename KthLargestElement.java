package Array;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
//[3, 2, 3, 1, 2, 4, 5, 5, 6] k=4
public class KthLargestElement {
    
    public int KthLargest(int arr[],int k){
        
       /* PriorityQueue<Integer> minHeap=new PriorityQueue();
        for(int i: arr){
            minHeap.add(i);
            System.out.print(minHeap);
            if(minHeap.size()>k){
                minHeap.remove();
            }
   
        }
        return minHeap.remove();
        Integer can not convert into int on leetcode
        */
        Arrays.sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
        return arr[arr.length-k];
    }
    public static void main(String[] args) {
        KthLargestElement obj=new KthLargestElement();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int n=obj.KthLargest(arr, k);
        System.out.println(n);
    }
    
}
