// insertion Sort using Array.
class Lab19B_93
{
	public static void main(String[] args) 
	{
		int[] arr = {29,10,14,37,13};
		int n =arr.length;
		int i=1;
		int key;
		while(i<n)
		{
			key =arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			i++;
		}

		for(int l=0;l<n;l++) 
		{
			System.out.println(arr[l]);	
		}	
	}
}

//prac
// class Lab19B_93
// {
// 	public static void main(String[] args) {
// 		int[] arr = {29,10,14,37,13};
// 		int i=1;
// 		int n=arr.length;
// 		int key;
// 		while(i<n)
// 		{
// 			key = arr[i];
// 			int j = i-1;
// 			if(j>=0 && arr[j]>key)
// 			{
// 				arr[j+1] = arr[j];
// 				j--; 
// 			}
// 			arr[j+1] = key;	
// 			i++;
// 		}
// 	}
// }