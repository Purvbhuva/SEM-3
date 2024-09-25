import java.util.Scanner;

public class LAB50 {
    int Q[];
    int N;
    int R=-1;
    int F=-1;
    LAB50(int size){
        this.N=size;
        Q = new int[size];
    }
    public void EnQue(int e){
        if (R==N-1) {
            R=0;
        }
        else{
            R++;
        }
        if (F==R) {
            System.out.println("-----Overflow------");
            if(R==0)
                R=N-1;
            else
                R--;
            return;
        }
        Q[R]=e;
        if (F==-1) {
            F=0;
        }
    }
    public int Dequeu(){
        if (F==-1) {
            System.out.println("UnderFlow");
        }
        int Y=Q[F];
        if (F==R) {
            F=R=-1;
        }
        else{
            if (F==N-1) {
                F=0;
            }
            else{
                F++;
            }
        }
        return Y;
    }
    public void display(){
        System.out.println("-------display-------");
        if (F<=R) {
            for (int i = F; i <= R; i++) {
                System.out.print(Q[i]+",");
            }
        }
        else{
            for (int i = F; i < N; i++) {
                System.out.print(Q[i]+",");
            }
            for (int i = 0; i <= R; i++) {
                System.out.print(Q[i]+",");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LAB50 Q = new LAB50(5);
        while (true) {
            System.out.print("1 Enque: \n2 deque: \n3 display: \ncase : ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter element : ");
                    int e = sc.nextInt();
                    Q.EnQue(e);
                    break;
                case 2:
                    System.out.println(Q.Dequeu());
                    break;
                case 3:
                    Q.display();
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

// ----------------------------------------------------------------------


// import java.util.Scanner;

// public class CirQue {
//     int Q[];
//     int N;
//     int R=-1;
//     int F=-1;
//     CirQue(int size){
//         this.N=size;
//         Q = new int[size];
//     }
//     public void EnQue(int e){
//         if ((F==0&&R==N-1)||(R+1==F)) {
//             System.out.println("-------overflow--------");
//         }
//         else{
//             R=(R+1)%N;
//             Q[R]=e;
//         }
//         if (F==-1) {
//             F=0;
//         }
//     }
//     public int Dequeu(){
//         if (F==-1) {
//             System.out.println("--------underflow--------");
//         }
//         int Y = Q[F];
//         if (F==R) {
//             F=R=-1;
//         }
//         else{
//             F=(F+1)%N;  
//         }
//         return Y;  
//     }
//     public void display(){
//         System.out.println("-------display-------");
//         int FQ=F;
//         int RQ=R;
//         while (FQ!=RQ) {
//             System.out.print(Q[FQ]+",");
//             FQ=(FQ+1)%(N);
//         }
//         System.out.print(Q[FQ]);
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         CirQue Q = new CirQue(5);
//         while (true) {
//             System.out.print("1 Enque: \n2 deque: \n3 display: \ncase : ");
//             int n = sc.nextInt();
//             switch (n) {
//                 case 1:
//                     System.out.print("Enter element : ");
//                     int e = sc.nextInt();
//                     Q.EnQue(e);
//                     break;
//                 case 2:
//                     System.out.println(Q.Dequeu());
//                     break;
//                 case 3:
//                     Q.display();
//                     break;
//                 case 4:
//                     System.exit(0);
//                     break;
            
//                 default:
//                     break;
//             }
//         }
//     }
    
// }

