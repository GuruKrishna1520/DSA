package strings;
import java.util.*;

public class reversestring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=0;
        int j=s.length()-1;
        char arr[]=s.toCharArray();
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String rev=new String(arr);
        System.out.print(rev);
    }
    
}
