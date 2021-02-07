import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in =new Scanner(System.in);
		
		
		System.out.println("Enter the number n=");
		
		int n=in.nextInt();
		
		
		
		for (int j=1;j<=n;j++)
		{
		
			for(int i=1;i<=j;i++)
			{
			System.out.print(i);
			}
			System.out.println("");
		}
		
		
		
		
	}

}
