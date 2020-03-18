/* Ahmed Osama Ismail
 * Sec:1  B.N:2
 */
import java.util.*;
public class prob2 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Please enter the length of the array:");
		int length=input.nextInt();
		int [] arr= new int[length];
		for(int i = 0;i<=(length-1);i++) {
		    arr[i] = input.nextInt();
		}
		int x=-1;
		System.out.print("Enter the Number");
		int num=input.nextInt();
		for(int i=0;i<=(length-1);i++)
		{
			for(int j=i+1;j<=(length-1);j++)
			{
			if(num==arr[i]+arr[j])
			{
				System.out.print("The Two Num:"+i+".."+j);
				System.exit(0);
			}
			}
		}
		
	}

}
