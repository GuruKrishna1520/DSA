package hashing;
import java.util.*;
public class groupanagrams {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       HashMap<String,List<String>> map=new HashMap<>();
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        
        for(String str:arr){
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        System.out.print(map.values());

    }
}
