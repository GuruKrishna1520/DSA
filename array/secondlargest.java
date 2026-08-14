package array;
import java.util.*;
public class secondlargest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];

            }
            else if(arr[i]>secmax && arr[i]<max){
                secmax=arr[i];

            }
        }
        System.out.print(secmax);
        sc.close();
    }
    
}
