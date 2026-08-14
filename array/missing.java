package array;
import java.util.*;
public class missing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int sum=0;
        int sum1=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.print(sum1-sum);
        sc.close();

    }
}
