import java.util.Scanner;
class operation{
    char ar[] = new char[10];
    int top=-1;
    void PUSH (char n ){
            
            top++;
            ar[top]=n;
            // System.out.println(ar[top]);
        
    }
    char POP(){
            char ch = ar[top];
            top--;
            return ch;      
    }
}

public class LAB39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        operation o = new operation();
        System.out.print("Enter string : ");
        String s = sc.nextLine();

        int i=0;
        while (s.charAt(i)!='c') {
            char c = s.charAt(i);
            o.PUSH(c);
            i++;
        }
        i++;
        boolean flag=true;
        while (i<s.length()) {
            char ch = s.charAt(i);
            if (o.POP()!=ch) {
                System.out.println("Invalid");
                flag=false;
            }
            i++;
        }
        if (flag==true) {
            System.out.println("Valid");
        }
        
    }
}
