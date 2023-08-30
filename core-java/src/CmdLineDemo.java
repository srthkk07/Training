
public class CmdLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (String a : args) {
			sum+=Integer.parseInt(a);			
		}
		System.out.println(sum);
		
		int x = 5;
		Integer xo = x;//Boxing
		int z= xo;//unboxing
		System.out.println(x + xo * z);
		//javatakes care of boxing and unboxing hence called Auto-boxing
	}

}
