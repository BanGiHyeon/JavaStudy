import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		num=scan.nextInt();
		
		
		if(num>=0)
		{
			System.out.println(num+"은(는) 양수입니다");
		}
		if(num<0)
		{
			System.out.println(num+"은(는) 음수입니다");
		}

	}

}
