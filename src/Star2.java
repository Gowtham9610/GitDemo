import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the n number=");
		
		
		int n =in.nextInt();
		
		int d=n;
		
		d--;
		
		
		for(int i=1;i<=n;i++)
		{
	
			for(int j=i;j<=d;j++)
			{
				System.out.print("1");
			}
			for(int q=1;q<=i;q++)
			{
				System.out.print(q);
			}
			System.out.println("");
		}

	}

}
