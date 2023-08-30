
import java.util.Iterator;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {1,2,3,4,6,7,8};
		for (int i = 0; i < args.length; i++) {
			System.out.print(ar[i]);
		}
		System.out.println();

		//using for-each loop
		for (int i : ar) {
			System.out.print(i);
			}
		System.out.println();
		
		int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		int[][]jag = {{1,2},{3,4,5},{6,7,8,9}};
		//print row wise using for-each loop
		for (int row[] : jag) {
			for (int i : row) {
				System.out.print ( i +" ");
			}
			System.out.println();
		}
	}

}
