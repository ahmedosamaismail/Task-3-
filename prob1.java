/* Ahmed Osama Ismail
 * Sec:1  B.N:2
 */
import java.util.*;

public class prob1 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int m ,n;
		System.out.print("Enter length of the Two arrays:");
		m=input.nextInt();
		n=input.nextInt();
		int j=0;
		int i=0;
		int [] arr1=new int [m];
		int [] arr2=new int [n];
		int [] arr3=new int [m+n];
		System.out.print("Enter the two arrays:");
		for (int k=0;k<=m-1;k++) {
            arr1 [k] = input.nextInt();
        }
		for (int k=0;k<=n-1;k++) {
            arr2 [k] = input.nextInt();
        }
		
		
		
		for( int x=0;x<=(m+n-1);x++)
		{
			for(   ;j<=(n-1)&&i<=(m-1);)
			{
				if (arr1[i]>arr2[j])
				{
					
					arr3[x]=arr2[j];
					System.out.print(arr3[x]+" ");
					if(j<(n-1)) {
					j++;}
					else 
					{
						for(;i<=m-1;) {
						arr3[x]=arr1[i];
						System.out.print(arr3[x]+" ");
						i++;
						x++;
						}
					}
					break;
				}
				else {
					if(arr1[i]<arr2[j])
					{
						
						arr3[x]=arr1[i];
						System.out.print(arr3[x]+" ");
						if(i<(m-1)) {
							i++;}
						else 
						{
							for(;j<=n-1;)
							{
							arr3[x]=arr2[j];
							System.out.print(arr3[x]+" ");
							j++;
							x++;
							}
						}
						
						break;
					}
					else
					{
							arr3[x]=arr1[i];
							arr3[x+1]=arr1[i];
							System.out.print(arr3[x]+" ");
							System.out.print(arr3[x]+" ");
							if(i<=(m-1)) {
								i++;}
							
							if(j<=(n-1)) {
								j++;}
							}
							
							x++;
							break;
						
					}
				}
				
			}
			
		
		}
		

	}


