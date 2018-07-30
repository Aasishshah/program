import java.util.*;
public class Factor1{
	public static void main(String[] args){
		int i;
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter any number:");
		Scanner sd = new Scanner(System.in);
		int b = sd.nextInt();
		for(i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			elseif(i%2!=0)
			{
				System.out.println(i);
			}
			else
			System.out.println("Error");	
		}
	}
}