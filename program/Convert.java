public class Convert{
	public static void main(String[] args){
		String n = "abc123";
		String Str1 = n.replaceAll("123","");
		System.out.println(Str1);
		String Str2 = n.replaceAll("abc","");
		System.out.println(Str2);
		String Str3 = Str2.trim();
		int r = Integer.parseInt(Str3);
System.out.println(+r);		
	}
}