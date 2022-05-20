import java.util.Scanner;

public class twoDimenison {
	
	public static void main(String args[])
	{
		String S[][]=new String[2][4];
		int i,j;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the values");
		
		for(i=0;i<S.length;i++) {
			for ( j=0;j<S[i].length;j++) {
				S[i][j]=sc.next();
				
			}
			
		}
		
		for(i=0;i<S.length;i++) {
			for ( j=0;j<S[i].length;j++) {
		System.out.println(S[i][j]);
		
	}
		}
	}

}
