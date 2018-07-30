import java.util.*;
public class ThrowDemo{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Type five characters:");
String rollNo = sc.nextLine();
if(rollNo.lenght()!=5){
	throw new RuntimeException("Not five characters");
}
System.out.println("Your input is : "+rollNo);
}
}