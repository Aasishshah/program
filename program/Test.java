public class Test{
public static void main(String[] args){
	int a = 10;
	int b = 0;
	int c = 0;
	try{
        c = a/b;
	//}catch(ArithmeticException e){ 
	}catch(Exception e){
		System.out.println("Exception occured"+e.getMessage());
	}
	System.out.println("Output is"+c);
	b=5;
	c=a/b;
	System.out.println("Output is"+c);
}
}