public class RegExDemo {

	public static void main(String[] args) {
		String name= "Sarthak";
		String mobile = "9741819013";
		String email = "ghoraisarthak@gmail.com";
		
		String nameRegex="[A-Z]{1}[a-z]{3,}";
		String mobileRegex="[6-9]{1}[0-9]{9}";
		String emailRegex="[a-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,}";
		
		System.out.println(name.matches(nameRegex)?"Valid name":"Invalid name");
		System.out.println(mobile.matches(mobileRegex)?"Valid  Mobile":"Invalid Mobile");
		System.out.println(email.matches(emailRegex)?"Valid  Email":"Invalid Email");

	}

}