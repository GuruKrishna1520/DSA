package hashing;
import java.util.*;
public class twosum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            int need=target-arr[i];
            if(map.containsKey(need)){
                System.out.print(map.get(need)+" "+i);
                return;
            }
            else{
                map.put(arr[i],i);
            }
        }
        System.out.print("pair not found");
    }
}
