import java.util.Scanner;

public class IOAllTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Helloworld!출력 결과물 뽑기
		System.out.println("Hello World!");
		
		//건강한 대한육군 결과물 2번뽑기
		System.out.println("건강한 대한민국");
		System.out.println("건강한 대한민국");
		
		//고양이 만들기 예제
		System.out.println("\\     /\\");
		System.out.println(" )   (   ')");
		System.out.println("(   /   )");
		System.out.println("\\(__)|");
		
		//더하기 예제
		int A = sc.nextInt(),B= sc.nextInt();
		if(A>10 && A<0 && B>10 && B<0) {
			A = sc.nextInt();
			B= sc.nextInt();
		}else {
			int result = A+B;
			System.out.println(result);
		}
		//빼기 예제
		System.out.println(sc.nextInt()-sc.nextInt());
		
		//곱셈 예제
		System.out.println(sc.nextInt()*sc.nextInt());
		
		//나누기 예제
		System.out.println(sc.nextDouble()/sc.nextDouble());
		
		
		    
	}
}
