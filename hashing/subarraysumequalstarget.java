package hashing;
import java.util.*;

public class subarraysumequalstarget {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int k=sc.nextInt();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        System.out.print(count);
    }
}
