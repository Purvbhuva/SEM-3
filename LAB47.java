import java.util.Scanner;
import java.util.Stack;

public class LAB47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s=new Stack<>();


        String sh = sc.nextLine();
        String m[] = sh.split(",");
        for (int i = 0; i < m.length; i++) {
            if (m[i].equals("+")||m[i].equals("-")||m[i].equals("*")||m[i].equals("/")) {
                int op2=s.pop();
                int op1=s.pop();
                char c = m[i].charAt(0);
                int ans=0;
                switch (c) {
                    case '+': ans=op1+op2 ;break;
                    case '-': ans=op1-op2 ;break;
                    case '*': ans=op1*op2 ;break;
                    case '/': ans=op1/op2 ;break;
                    default:break;
                }
                s.push(ans);
            }
            else{
                int b = Integer.parseInt(m[i]);
                s.push(b);
            }
        }
        System.out.println(s.pop());
        // for (int i = 0; i < sh.length(); i++) {
        //     char c = sh.charAt(i);
        //     int dig=0;
        //     while (c!=','&&c!='+'&&c!='-'&&c!='*'&&c!='/'&&c!='^') {
        //                 dig=dig*10+Integer.parseInt(c+"");          
        //                 i++;
        //                 if (i==sh.length()) {
        //                     break;
        //                 }
        //                 else{
        //                     c=sh.charAt(i);
        //                 }
        //             }

        //     if (c=='+'||c=='-'||c=='*'||c=='/'||c=='^') {
        //         int op1=s.pop();
        //         int op2=s.pop();
        //         int ans=0;
        //         switch (c) {
        //             case '+':ans = op1+op2 ;break;
        //             case '-':ans = op1-op2 ;break;
        //             case '*':ans = op1*op2 ;break;
        //             case '/':ans = op1/op2 ;break;
        //             default:
        //                 break;
        //         }
        //         s.push(ans);
        //     }
        //     else{
        //         s.push(dig);
        //     }
        // }
        // System.out.println(s.pop());
    }
    
}
