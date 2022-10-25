package assignment_1;

public class Vshape {

	public static void main(String[] args) {
	

		int n = 23;
		
		for (int i =1 ; i<=n ; i++) {
			
			for (int j=1; j<=n ; j++) {
				
				if(i==n || i==n-1 || (j== n && i>=(n)/2) || (j==1 && i>=(n)/2) || (i-j >= n/2) || (i+j >= (3*(n-1)/2)+2) )
				
				System.out.print("*");
				
				else
				
					System.out.print(" ");
				
			}
			System.out.println();

	}

}
}
