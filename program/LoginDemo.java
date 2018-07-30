public class LoginDemo{
	public static void main(String[] args){
		Login l = new Login();
		System.out.println("Output:"+l.getUsername());
		l.setUsername("Bijay");
		System.out.println("Output:"+l.getUsername());
		
	}
}