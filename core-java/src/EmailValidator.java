public class EmailValidator {

	public static void main(String[] args) {
		//1-min 4 chars before @
		//2-min 3 chars between @ and .
		//3-min 2 chars after .
		//4-only 1 occurrence of @ and . is allowed 
		//note - no regular expressions allowed 
		String email="iamsg07@gmail.com";
		String s1=email.replace("@", "");  //string email without @
		String s2=email.replace(".", "");  //string email without .
		if		(email.indexOf('@')>=4 && 
				(email.indexOf('.')-email.indexOf('@')) >= 4 &&
				(email.length()-email.indexOf('.'))>=3 && 
				(email.length()-s1.length()==1)&&
				(email.length()-s2.length()==1)) {
			System.out.println("Valid Email");
	}
		else
			System.out.println("Not Valid!!");

}
}
