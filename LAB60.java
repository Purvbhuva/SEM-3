import java.util.Scanner;

public class LAB60 {
    Node first;
    Node begin;
    class Node{
        int info;
        Node link;
        Node(int info){
            this.info=info;
            this.link=null;
        }
    }
    public void PUSH(int info){
        Node newNode = new Node(info);
        if (first==null) {
            first=newNode;
            return;
        }
        Node currNode = first;
        while (currNode.link!=null) {
            currNode = currNode.link;
        }
        currNode.link=newNode;
    }
    public int POP(){
        
        if (first==null) {
            System.out.println("Underflow");
            return 0;
        }
        if (first.link==null) {
            first=first.link;
            return 0;
        }
        Node temp=first;
        Node pred=null;
        while (temp.link!=null) {
            pred=temp;
            temp=temp.link;
        }
            int r =  temp.info;
            pred.link=temp.link;
            return r;
    }
    public int peep(){
        Node temp=first;
        Node pred=null;
        while (temp.link!=null) {
            pred=temp;
            temp=temp.link;
        }
            int r =  temp.info;
            return r;
    }
    public void Change(int num,int change){
        Node temp=first;
        if (first.info==num) {
            first.info=change;
            return;
        }
        while (temp.info!=num && temp.link!=null) {
            temp=temp.link;
        }
        if (temp.info!=num) {
            System.out.println("Enetr valid number to replace ");
            return;
        }
        temp.info=change;
    }

    public void printList(){
        System.out.println("-------display--------");
        if (first==null) {
            System.out.print("List is empty ");
        }
        Node currNode = first;
        while (currNode!=null) {
            System.out.print(currNode.info);
            currNode=currNode.link;
        }
        System.out.println();
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        LAB60 ll = new LAB60();
        while (true) {
            System.out.print("1:PUSH  \n2:POP \n3:PEEP \n4:change \n5:PrintList \ncase : ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter element Push : ");
                    int e1 = sc.nextInt();
                    ll.PUSH(e1);
                    break;
                case 2:
                    System.out.println("POP element is : "+ll.POP());
                    break;
                case 3:
                    System.out.println("Peep element is : "+ll.peep());
                    break;
                case 4:
                    System.out.print("Enetr number want to replace : ");
                    int n1 = sc.nextInt();
                    System.out.print("Enetr replace number : ");
                    int change = sc.nextInt();
                    ll.Change(n1, change);
                    break;
                case 5:
                    ll.printList();
                    break;
                case 8:
                    System.exit(0);
                default:
                    break;
            }
        }
    
    }
}
