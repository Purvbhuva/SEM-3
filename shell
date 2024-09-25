import java.util.Arrays;
import java.util.Scanner;

public class LAB99 {
    public void sell(int arr[],int length){
        for (int interval = length/2; interval>0 ; interval=interval/2) {
            for (int i = interval; i < length; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j>=interval && arr[j-interval]>temp; j=j-interval) {
                    arr[j]=arr[j-interval];
                }
                arr[j]=temp;
            }
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
        LAB99 s = new LAB99();
        s.sell(arr, arr.length);
        System.out.println("--------after sorting-------");
        System.out.println(Arrays.toString(arr));
    }
}
