package if_else_Test;

import java.util.Scanner;

public class if_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		if((a/10)>=9)System.out.println("A");
		else if((a/10)>=8) System.out.println("B");
		else if((a/10)>=7) System.out.println("C");
		else if((a/10)>=6) System.out.println("D");
		else System.out.println("F");
	}
}
