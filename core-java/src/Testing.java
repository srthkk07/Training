public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="iamsg07@gmail.com";
		int a= email.length();
		int b= email.indexOf('.');
		int c= email.indexOf('@');
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		String s1= email.replace("@","");
		String s2= email.replace(".", "");
		System.out.println(s1.length());
		System.out.println(s2.length());

	}

}
