import java.util.Scanner;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			max = Math.max(max, sc.nextInt());
		}
		
		System.out.println(max);
	}
}
