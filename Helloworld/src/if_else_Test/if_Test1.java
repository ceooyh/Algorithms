package if_else_Test;

import java.util.Scanner;

public class if_Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		
		if(a>b)System.out.println(">");
		else if(a<b) System.out.println("<");
		else System.out.println("==");
	}

}
