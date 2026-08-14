package array;
import java.util.*;
public class subarraykandane {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            maxsum=Math.max(sum,maxsum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.print(maxsum);
    }
}
