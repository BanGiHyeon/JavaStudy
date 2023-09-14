import java.util.Scanner;

public class 연산자응용문제풀이5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("농구공 갯수:");
		int ball=scan.nextInt();
		System.out.println("필요한 상자의 수:"+(ball%5==0?ball/5:ball/5+1));
		
		

	}

}
