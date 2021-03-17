import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;


public class Multiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 곱셈 문제 : 두수를 입력받고 두수를 곱하는데 2번째로 입력한수의 자릿수별로 곱한 값을 각줄별로 출력하고
		 * 마지막 줄에는 두수의 곱을 출력한다. 
		 * */
		
		//곱셈 방법1
		int A = sc.nextInt();
		String B = sc.next();
		
		System.out.println(A*(B.charAt(2)-'0'));//charAt(B)는 B의 문자열중 index0부터 시작해서 자릿수의 값을 반환하는 함수이다. 
		System.out.println(A*(B.charAt(1)-'0'));//-'0'을 한이유 : 0아스키코드값을 빼면 해당 숫자의 값만 남기때문
		System.out.println(A*(B.charAt(0)-'0'));
		System.out.println(A*Integer.parseInt(B));
		
		
		//곱셈방법2
		Scanner sd = new Scanner(System.in);
		int C = sd.nextInt();
		int D = sd.nextInt();
		
		System.out.println(C*(D%10));
		System.out.println(C*((D%100)/10));
		System.out.println(C*(D/100));
		System.out.println(C*D);
		
		
	}
}
