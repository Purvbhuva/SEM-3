import java.util.Scanner;
import java.util.Stack;

public class LAB45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        s.push('(');
        String polish="";
        int RANK =0;
        System.out.print("Enter Q : ");
        String INFIX = sc.nextLine()+')';
        char NEXT,temp;      

        for (int i = 0; i < INFIX.length(); i++) {
            NEXT=INFIX.charAt(i);
            if (s.size()<-1) {
                System.out.println("Invalid");
                System.exit(0);
            }
            while (G(s.peek())>F(NEXT)) {
                temp=s.pop();
                polish=polish+temp;
                RANK=RANK+R(temp);
                if (RANK<1) {
                    System.out.println("Invalid");
                    System.exit(0);
                }
            }
            if (G(s.peek())!=F(NEXT)) {
                s.push(NEXT);
            }
            else{
                s.pop();
            }
        }
        System.out.println(polish);

    }
    static public int F(char c){
        int ans=0;
        switch (c) {
            case '+':case '-':ans= 1;break;
            case '*':case '/':ans= 3;break;
            case '^':ans= 6;break;
            case '(':ans= 9;break;
            case ')':ans= 0;break;
            default:ans=7;break;
        }
        return ans;
    }
    static public int G(char c){
        int ans2=0;
        switch (c) {
            case '+':case '-':ans2= 2;break;
            case '*':case '/':ans2= 4;break;
            case '^':ans2= 5;break;
            case '(':ans2= 0;break;
            default:ans2=8;break;
        }
        return ans2;
    }
    static public int R(char c){
        int ans3=0;
        switch (c) {
            case '+':case '-':case '*':case '/':case '^':ans3= -1;break;
            default:ans3=1;break;
        }
        return ans3;
    }
    
}
