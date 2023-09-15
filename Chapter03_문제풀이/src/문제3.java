import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hak;
		int score;
		Scanner scan=new Scanner(System.in);
		System.out.print("학년 입력(1~4):");
		hak=scan.nextInt();
		
		System.out.print("점수 입력:");
		score=scan.nextInt();
		
		if(score<0 || score>100)
		{
			System.out.println("경고☞ 잘못된입력입니다");
		}
		if(score>=0 && score<=100)
		{
			if(hak==4)
			{
				if(score>=70)
				{
					System.out.println("합격");
				}
				if(score<70)
				{
					System.out.println("불합격");
				}
			}
			if(hak!=4)
			{
				if(score>=60)
				{
					System.out.println("합격");
				}
				if(score<60)
				{
					System.out.println("불합격");
				}
			}
		}
	}
}
		
		
		
		


