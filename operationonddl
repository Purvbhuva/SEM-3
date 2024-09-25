import java.util.Scanner;

public class LAB72 {
    Node first;
    Node last;
    class Node{
        int info;
        Node lptr;
        Node rptr;
        Node(int info){
            this.info=info;
            this.lptr=null;
            this.rptr=null;
        }
    }
    void inserFirst(int info){
        Node newNode = new Node(info);
        if (first==null) {
            first=newNode;
            last=newNode;
        }
        else{
            newNode.rptr=first;
            first.lptr=newNode;
            first=newNode;
        }
    }
    void inserLast(int info){
        Node newNode = new Node(info);
        if (first==null) {
            first=newNode;
            last=newNode;
        }
        else{
            last.rptr=newNode;
            newNode.lptr=last;
            last=newNode;
        }
    }
    void delete(int n){
        Node temp=first;
        if (first.info==n) {
            first=first.rptr;
            return;
        }
        while (temp!=null) {
            // Node check=temp.rptr;
            Node pred=temp;
            temp=temp.rptr;
            System.out.println("temp = "+temp.info);
            System.out.println("pred = "+pred.info);
            
            if (n==temp.info) {
                pred.rptr=temp.rptr;
                temp.rptr=pred;
                break;
            }
            // pred=check;
            // temp=temp.rptr;
        }
    }
    void shorting(int n ){
        Node newNode = new Node(n);
        Node temp = first;
        Node pred = temp;
        while (temp!=last) {
            if (temp.info>newNode.info) {
                newNode.rptr=temp;
                temp.lptr=newNode;
                pred.rptr=newNode;
                newNode.lptr=pred;
                return;
            } 
            pred=temp;
            temp=temp.rptr;
        }
        if (temp==last) {
            
        }
    }
    void printList(){
        System.out.println("--------display--------");
        Node temp = first;
        while (temp!=null) {
            System.out.println(temp.info);
            temp=temp.rptr;
        }
    }
    void alterDelete(){
        Node pred=first;
        while (pred.rptr!=null && pred!=null) {
            Node next=pred.rptr;
            if (next.rptr==null) {
                pred.rptr=next.rptr;
                break;
            }
            pred.rptr=next.rptr;
            next.rptr=pred;
            pred=pred.rptr;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LAB72 ll = new LAB72();
        while (true) {
            System.out.print("1:first 2:last 3:print 5:delete 6:shorting 4:break ~ ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter Element : ");
                    int e = sc.nextInt();
                    ll.inserFirst(e);
                    break;
                case 2:
                    System.out.print("Enter Element : ");
                    int e2 = sc.nextInt();
                    ll.inserLast(e2);
                    break;
                case 3:
                    ll.printList();
                    break;
                case 5:
                    System.out.print("Enter Element : ");
                    int d = sc.nextInt();
                    ll.delete(d);
                    break;
                case 6:
                    System.out.print("Enter Element : ");
                    int e3 = sc.nextInt();
                    ll.shorting(e3);
                    break;
                case 7:
                    ll.alterDelete();
                    break;
                case 4:
                    System.exit(0);
                    break;
                
            
                default:
                    break;
            }
        }
        
    }
}
