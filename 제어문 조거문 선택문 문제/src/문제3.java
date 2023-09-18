import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int a=scan.nextInt();
		int result=0;
		if(a<0)
		{
			a*=-1;
			System.out.println(a+"의 절대값은"+result+"입니다");
		}

	}

}
