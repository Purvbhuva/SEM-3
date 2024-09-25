import java.util.Scanner;

public class LAB96 {
    void merge(int arr[],int left,int right){
        if (left>=right)return;
        int m = (left+right)/2;
        merge(arr, left, m);
        merge(arr, m+1, right);
        shortAr(arr,left,m,right);
    }
    void shortAr(int arr[],int left,int m,int right){
        int L=left;
        int R=m+1;
        int []temp=new int[right-left+1];
        int x=0;
        while (L<=m&&R<=right) {
            if (arr[L]<arr[R]) {
                temp[x++]=arr[L++];
            }
            else{
                temp[x++]=arr[R++];
            }
        }
        while (L<=m) {
            temp[x++]=arr[L++];
        }
        while(R<=right) {
            temp[x++]=arr[R++];
        }
        for (int i = 0,j=left; i < temp.length; i++) {
            arr[j]=temp[i];
            j++;
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
        LAB96 MS = new LAB96();
        MS.merge(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
