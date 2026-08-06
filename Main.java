import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList l = new LinkedList();

        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            l.insert(ele);
        }

        int k = sc.nextInt();

        l.remove(n, k);
        l.print();
        sc.close();
    }
}
class LinkedList {
    Node head;
    Node tail;

    public void insert(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void remove(int n, int k) {

        int pos = n - k;

        if (pos == 0) {
            head = head.next;

            if (head == null)
                tail = null;

            return;
        }

        Node temp = head;

        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        if (temp != null && temp.next != null) {
            Node temp1 = temp.next;
            temp.next = temp.next.next;

            if (temp.next == null)
                tail = temp;

            temp1.next = null;
        }
    }
     public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}