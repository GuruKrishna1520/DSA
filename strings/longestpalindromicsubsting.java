package strings;
import java.util.*;
public class longestpalindromicsubsting {
    public static String expand(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        String res="";
        for(int i=0;i<n;i++){
            String p1=expand(s,i,i);
            String p2=expand(s,i,i+1);
            if(p1.length()>res.length()){
                res=p1;
            }
            else if(p2.length()>res.length()){
                res=p2;
            }
        }
        System.out.print(res);

    }
}
