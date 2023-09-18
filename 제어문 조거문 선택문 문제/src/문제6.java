import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,math,total,avg;
		double avg2;
		char score=' ';
		Scanner scan=new Scanner(System.in);
		System.out.print("국어입력:");
		kor=scan.nextInt();
		
		System.out.print("영어입력:");
		eng=scan.nextInt();
		
		System.out.print("수학입력:");
		math=scan.nextInt();
		
		total=(kor+eng+math);
		avg2=total/3.0;
		
		avg=(int)(avg2/10);
		switch(avg)
		{
		case 10:case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default:
			score='F';
		}
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg2);
		System.out.println("학점:"+score+"학점");


	}

}
