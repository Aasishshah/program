import java.util.*;
public class Switch{
public static void main(String[] args){
	System.out.println("Enter any number form 1-7:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch(a)
		{
			case 1:
			System.out.println("Its Sunday");
			break;
			case 2:
			System.out.println("Its Monday");
			break;
			case 3:
			System.out.println("Its Tuesday");
			break;
			case 4:
			System.out.println("Its Wednesday");
			break;
			case 5:
			System.out.println("Its Thusday");
			break;
			case 6:
			System.out.println("Its Friday");
			break;
			case 7:
			System.out.println("Its Saturday");
			break;
			default:
			System.out.println("Wrong input...!!!! Thankyou");
		}
}
}
		