
import java.util.Scanner;

public class LAB56_57_62_TO_69 {
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
    public void addFirst(int info){
        Node newNode = new Node(info);
        if (first==null) {
            first = newNode;
        }
        else{
            newNode.link=first;
            first=newNode;
        }
    }
    public void addLast(int info){
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
    public void delete(int key){
        
        if (first==null) {
            System.out.println("Underflow");
            return;
        }
        Node temp=first;
        Node pred=null;
        while (temp.info!=key && temp.link!=null) {
            pred=temp;
            temp=temp.link;
        }
        if (temp.info!=key) {
            System.out.println("Node not found");
        }
        if (key==first.info) {
            first=first.link;            
        }
        else{
            pred.link=temp.link;
        }
    }

    public void printList(){
        System.out.println("-------display--------");
        if (first==null) {
            System.out.print("List is empty ");
        }
        Node currNode = first;
        while (currNode!=null) {
            System.out.print(currNode.info+",");
            currNode=currNode.link;
        }
        System.out.println();
    }
    public void OederList(int num){
        Node temp=first;
        Node changeSrt = new Node(num);
        while (temp.link!=null&&changeSrt.info>=temp.link.info) {
            temp=temp.link;
        }
        changeSrt.link=temp.link;
        temp.link=changeSrt;
    }
    public void copyList(){
        // Node newNode;
        // Node avail=first;
        // if(first==null){
        //     return ;
        // }
        // else{
        //     newNode=avail;
        //     avail=avail.link;
        //     newNode.info=first.info;
        //     begin=newNode;
        // }
        // Node temp = first;
        // Node pred;
        // while (temp.link!=null) {
        //     pred=newNode;
        //     temp=temp.link;
        //     newNode=new Node(0);
        //     newNode=avail;
        //     avail=avail.link;
        //     newNode.info=temp.info;
        //     pred.link=newNode;
        // }
        // newNode.link=null;
        Node newNode;
        newNode=first;
        newNode.info=first.info;
        begin=newNode;
        Node temp=first;
        Node pred=newNode;
        while (temp.link!=null) {
            temp=temp.link;
            newNode = new Node(temp.info);
            pred.link=newNode;
            pred=newNode;
        }
        System.out.println("-------List copy sucessfull--------");
    }
    public void copyPrintList(){
        System.out.println("-------display copy Link List--------");
        if (begin==null) {
            System.out.print("List is empty ");
        }
        Node currNode = begin;
        while (currNode!=null) {
            System.out.print(currNode.info);
            currNode=currNode.link;
        }
        System.out.println();
    }
    public void dublicate(){
        Node temp = first;
        Node check;
        Node pred;
        while (temp!=null) {
        check = temp.link;
        pred = temp;
            while (check!=null) {
                if (temp.info==check.info) {
                    pred.link = check.link;  
                    check=check.link;                 
                }
                else{
                    pred=check;
                    check=check.link;
                }                
            }
            temp=temp.link;
        }
    }
    public void reverse(){
        Node check=first.link;
        Node addF;
        first.link=null;
        while (check!=null) {
            addF=check;
            check=check.link;
            addF.link=first;
            first=addF;    
        }
    }
    public void shorting(){
        if (first==null) {
            System.out.println("List is empty ");
            return;
        }
        Node temp=first;
        Node check;
        int i=1;
        int j=i+1;
        while (temp!=null) {
            check=temp.link;
            while (check!=null) {
                if (temp.info>check.info) {
                    swap(i, j);
                    Node swap=temp;
                    temp=check;
                    check=swap;
                    printList();
                }
                System.out.println("check = "+check.info);
                j++;
                check=check.link;
            }
            temp=temp.link;
            i++;
            j=i+1;
            
        }
    }

    void Kth(int i){
        int count=0;
        Node temp=first;
        while (temp!=null) {
            count++;
            temp=temp.link;
        }
        int j=(count-i)+1;
        swap(i, j);
    }
    void swap(int i,int j){
        System.out.println(i+" and "+j);
        Node KF=first;
        Node KL=first;
        Node predF = null;
        Node predL = null;
        int n=1;
        while (n<i) {
            predF=KF;
            KF=KF.link;
            n++;
        }
        n=1;
        while (n<j) {
            predL=KL;
            KL=KL.link;
            n++;
        }
        if (predF==null) {
            predL.link=KF;
            Node swapN = KL.link;
            KL.link=first.link;
            first=KL;
            KF.link=swapN; 
        }else{
            Node swap=KL.link;
            predF.link=KL;
            predL.link=KF;
            KL.link=KF.link;
            KF.link=swap;
        }
    }
    void GCD(){
        Node temp=first;

        Node pred;
        while (temp.link!=null) {
            pred=temp;
            temp=temp.link;
            int info = calGCD(pred.info, temp.info);
            System.out.println(info);
            Node newNode = new Node(info);
            pred.link=newNode;
            newNode.link=temp;
        }
    }
    int calGCD(int n,int n2){
        int min = Math.min(n, n2);
        int GCD=0;
        for (int i = 1; i <= min ; i++) {
            if (n%i==0&&n2%i==0) {
                GCD=i;
            }
        }
        return GCD;
    }
    // void LAB68(){
    //     Node temp = first;
    //     int i=1;
    //     int j =i+1;
    //     while (temp!=null) {
    //         swap(i, j);
    //         i=i+2;
    //         j=i+1;
    //         temp=temp.link.link;
    //     } 
    // }
    // swap two corresponding nodes
    public void LAB68()
    {
        Node pred=first; 
        Node save=first.link;
        Node temp=pred;
        int count=0;
       
        while(pred.link!=null){
            Node swap_node=save.link;
            save.link=pred;
            pred.link=swap_node;

            if(count==0){
                first=save;
                count++;
            }
            
            temp=pred;

            if(pred.link!=null){
                pred=pred.link;
                save=pred.link;
                temp.link=save;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LAB56_57_62_TO_69 ll = new LAB56_57_62_TO_69();
        while (true) {
            System.out.print("1:Insert first \n2:Insert Last  \n3:delete \n4:display \n5:Enter in shorting \n6:copy \n7:print copy list \n8:dublicate \n9:reverse \n10:shortting \n11:KTh \n12:GCD \n13:LAB68 \n14:EXIT \ncase No : ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter element first : ");
                    int e = sc.nextInt();
                    ll.addFirst(e);
                    break;
                case 2:
                    System.out.print("Enter element last : ");
                    int e1 = sc.nextInt();
                    ll.addLast(e1);
                    break;
                case 3:
                    System.out.print("Enter element delete : ");
                    int e2 = sc.nextInt();
                    ll.delete(e2);
                    break;
                case 4:
                    ll.printList();
                    break;
                case 5:
                System.out.print("Enter element : ");
                int e3 = sc.nextInt();
                ll.OederList(e3);
                    break;
                case 6:
                    ll.copyList();
                    break;
                case 7:
                    ll.copyPrintList();
                    break;
                case 8:
                    ll.dublicate();
                    break;
                case 9:
                    ll.reverse();
                    break;
                case 10:
                    ll.shorting();
                    break;
                case 11:
                    System.out.println("Enter kth place ");
                    int k = sc.nextInt();
                    ll.Kth(k);
                    break;
                case 12:
                    ll.GCD();
                    break;
                case 14:
                    ll.LAB68();
                    break;
                case 13:
                    System.exit(0);
                
                default:
                    break;
            }
        }
    }
}