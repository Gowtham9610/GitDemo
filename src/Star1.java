import java.util.Scanner;

public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		
		
		System.out.print("Enter the number");
		int n=in.nextInt();
		
		
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
	}

}
