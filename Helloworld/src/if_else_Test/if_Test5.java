package if_else_Test;

import java.util.Scanner;

public class if_Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt(),m=sc.nextInt();
		m -=45;
		
		if(m<0) {
			if(h==0) {
				h=23;
				m=60+m;
			}else {
				h -=1;
				m=60+m;
			}
			
		}
		System.out.println(h + " " + m);
	}
}
