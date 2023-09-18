import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		int result=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력:");
		a=scan.nextInt();
		
		System.out.print("두번째 정수 입력:");
		b=scan.nextInt();
		
		System.out.print("연산자 입력:(+,-,*,/)");
		switch(scan.next())
		{
		case"+":
		result=a+b;
		break;
		case"-":
			result=a-b;
			break;
		case"*":
			result=a*b;
			break;
		case"/":
			result=a/b;
			break;
			default:
				System.out.println("잘못된 연산자입니다");
		
		}
System.out.println("계산 결과값:"+result);
	}

}
