import java.util.Scanner;

public class LAB38 {
    int top=-1;
    int s[];
    LAB38(int size){
        s=new int[size];
    }
    void PUSH(int e){
        if (top>=s.length) {
            System.out.println("-------overflow------");
            return;
        }
        s[++top]=e;
    }
    int POP(){
        if (top<=0) {
            System.out.println("-------underflow------");
            return 0;
        }
        return s[top--];
    }
    int PEEK(){
        if (top<=0) {
            System.out.println("-------underflow------");
            return -1;
        }
        return s[top];
    }
    int CHANGE(int i,int e){
        if (i>=s.length) {
            System.out.println("--------overflow-------");
            return -1;
        }
        return s[top-i+1]=e;
    }
    void DISPLAY(){
        System.out.println("-------display-----");
        for (int i = top; i >= 0; i--) {
            System.out.print(s[i]);
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size : ");
        int size = sc.nextInt();
        LAB38 s = new LAB38(size);
        while (true) {
            System.out.print("1:push 2:pop 3:peep 4:change 5:display ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter element : ");
                    int e = sc.nextInt();
                    s.PUSH(e);
                    break;
                case 2:
                    System.out.println(s.POP());
                    break;
                case 3:
                    System.out.println(s.PEEK());
                    break;
                case 4:
                    System.out.print("Enter index : ");
                    int i = sc.nextInt();
                    System.out.print("Enter change elemnt : ");
                    int e2 = sc.nextInt();
                    s.CHANGE(i,e2);
                    break;
                case 5:
                    s.DISPLAY();
                    break;
            
                default:
                System.exit(0);
                    break;
            }
        }
    }
    
}