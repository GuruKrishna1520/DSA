package strings;
import java.util.*;

public class longestsubstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int maxlen=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(map.containsKey(ch) && i<=map.get(ch)){
                i=map.get(ch)+1;
            }
            else{
                map.put(ch,j);
                maxlen=Math.max(maxlen,j-i+1);
                j++;
            }
        }
        System.out.print(maxlen);

    }
}
