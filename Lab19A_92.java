//bubble short
//accend
import java.util.Scanner;
class Lab19A_92
{
	public static void main(String[] args) 
	{
		int[] a = {25,15,35,18,41,17,98,23};
		int c=0;
		//extra for optimization of code
		// boolean flag = false;//has any swapping happen


		outerloop:for (int i=0;i<a.length;i++ ) 
		{
				for(int j=0;j<a.length-i-1;j++)
				{
					if(a[j]>a[j+1])
					{
						c = a[j];
						a[j] = a[j+1];
						a[j+1]=c;
						// flag = true;//swapping is happen
					}	
				}
				//extra
				// if(flag == false)//have any swap happen?
				// {
				// 	break outerloop;
				// }
		}	
		for (int i=0;i<a.length ;i++ ) {
			System.out.println(a[i]);
		}
	}
}