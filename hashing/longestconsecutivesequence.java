package hashing;
import java.util.*;
class longestconsecutivesequence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        int maxlen=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int curr=num;
                int currlen=1;
                while(set.contains(curr+1)){
                    curr++;
                    currlen++;
                }
                maxlen=Math.max(maxlen,currlen);

            }

        }
        System.out.print(maxlen);

    }
}