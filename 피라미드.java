import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			for(int j=n-1; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<(2*i)+1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
