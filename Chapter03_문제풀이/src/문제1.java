import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		if(num>=50)
		{
			System.out.println(num+"는(은) 50이상입니다:");
		}
		if(num<=50)
		{
			System.out.println(num+"는(은) 50미안입니다:");
		}
		

	}

}
