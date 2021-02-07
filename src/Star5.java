import java.util.Scanner;

public class Star5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number n=");
		
		int n=in.nextInt();
		
		for (int q=1;q<=n;q++) 
		{
			
			for (int i=n;i>=q;i--)
			{
			System.out.print(i);
			}
			System.out.println("");
		}
	}

}
