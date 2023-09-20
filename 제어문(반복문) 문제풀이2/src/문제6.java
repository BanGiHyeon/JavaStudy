import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력 (시작):");
		int a=scan.nextInt();
		
		System.out.println("정수 입력 (끝):");
		int b=scan.nextInt();
		
		int res=1;
		for(int i=a;i<=b;i++)
		{
			res*=i;
		}
		System.out.println("결과값:"+res);

	}

}
