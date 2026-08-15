package strings;
import java.util.*;

public class FirstNonrepchar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                System.out.print(i);
                return;
            }
        }
        System.out.print("-1");


    }
}
