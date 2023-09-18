import java.util.Scanner;
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int a=scan.nextInt();
		
		if((a%4==0 && a%100!=0)||(a%400==0))
		{
			System.out.println(a+"년도 윤년입니다");
		}
		else
		{
			System.out.println(a+"년도 윤년이 아닙니다");
		}

	}

}
