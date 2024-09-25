import java.util.Scanner;

public class LAB95 {
    public int max(int arr[]){
        int max=arr[0]; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    public void Radix(int arr[],int max){
        for (int i = 1; max/i > 0 ; i*=10) {
            counting(arr, i);
        }
    }
    public void counting(int arr[],int place){
        int count[]= new int[10];
        int output[]= new int[arr.length];

        

        for (int i = 0; i < arr.length; i++) {
            count[(arr[i]/place)%10]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i]+=count[i-1];
        }

        // for (int i = 0; i < count.length; i++) {
        //     System.out.println(count[i]);
        // }
        // System.out.println("--------------------------------");

        for (int i = arr.length-1; i >=0; i--) {
            output[count[(arr[i]/place)%10]-1]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        for (int i = 0; i < output.length; i++) {
            arr[i]=output[i];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        int arr[]= new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter elemnt at index ["+i+"] : ");
            arr[i]=sc.nextInt();
        }
        LAB95 c = new LAB95();
        c.Radix(arr, c.max(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
