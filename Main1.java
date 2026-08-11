import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
class LinkedList{
    Node head;
    Node tail;
    public void insert(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
        }
        tail.next=n;
        tail=n;

    }
    public void pos(int pos,int val){
        Node n=new Node(val);
        if(pos==1){
            n.next=head;
            head=n;
            if(tail==null){
                tail=n;
            }
            return;
        }
        Node temp=head;
        int count=1;
        if(temp==null){
            insert(val);
            return;
        }
        while(temp!=null && count<pos-1){
            temp=temp.next;
            count++;
        }
        n.next=temp.next;
        temp.next=n;
        if(n.next==null){
            tail=n;
        }
        
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

}
public class Main1
{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    LinkedList l=new LinkedList();
    for(int i=0;i<n;i++){
        int ele=sc.nextInt();
        l.insert(ele);

    }
    int posi=sc.nextInt();
    int val=sc.nextInt();
    
    l.pos(posi,val);
    l.print();
    sc.close();

}
}
