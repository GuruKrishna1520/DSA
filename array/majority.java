package array;
import java.util.*;
public class majority {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int candidate=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0){
                candidate=arr[i];
            }
            if(candidate==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.print(candidate);
    }
}
