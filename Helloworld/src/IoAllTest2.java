import java.util.Scanner;

public class IoAllTest2{
    
    public static void main(String[] args){
    	//나머지 구하기
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
	        System.out.println((A+B)%C);
	        System.out.println(((A%C) + (B%C))%C);
	        System.out.println((A*B)%C);
	        System.out.println(((A%C) * (B%C))%C);
    }
}
