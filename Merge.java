import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
class Merge{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList l1=new LinkedList();
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            l1.insert(ele);
        }
        int m=sc.nextInt();
        LinkedList l2=new LinkedList();
        for(int i=0;i<m;i++){
            int ele=sc.nextInt();
            l2.insert(ele);
        }
        LinkedList l3=new LinkedList();
        l3.merge(l1.head,l2.head);
        l3.print();
       sc.close();
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
        else{
            tail.next=n;
            tail=n;
        }

        
    }
    public void merge(Node list1,Node list2){
        Node dummy=new Node(-1);
        tail=dummy;
        while(list1!=null && list2!=null){
            if(list1.data<=list2.data){

                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        while(list1!=null){
            tail.next=list1;
            list1=list1.next;
            tail=tail.next;
        }
        while(list2!=null){
            tail.next=list2;
            list2=list2.next;
            tail=tail.next;
        }
        head=dummy.next;


    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
