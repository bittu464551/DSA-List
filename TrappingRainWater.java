package Array;
import java.util.Scanner;
public class TrappingRainWater {
    public int trappingWater(int[] height){
        int result=0;
        int maxL=Integer.MIN_VALUE;
        int maxR=Integer.MIN_VALUE;
        int arrL[]=new int[height.length];
        int arrR[]=new int[height.length];
        for(int i=0;i<height.length;i++){
            int tempL=height[i];
            int tempR=height[height.length-i-1];
            if(tempL>maxL){
                maxL=tempL;
            }
            if(tempR>maxR){
                maxR=tempR;
            }
            arrL[i]=maxL;
            arrR[height.length-i-1]=maxR;
            
        }
        for(int i=0;i<height.length;i++){
            result+=Math.min(arrL[i],arrR[i])-height[i];
        }
        return result;
    }
    public static void main(String[] args) {
        TrappingRainWater obj=new TrappingRainWater();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int nums[]=new int[num];
        for(int i=0;i<num;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(obj.trappingWater(nums));
    }
}
