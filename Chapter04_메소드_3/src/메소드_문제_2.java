// 정수 한개 입력 => 3의 배수 여부 확인
import java.util.*;
public class 메소드_문제_2 {
    static int userInput()
    {
    	Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
        int num=scan.nextInt();
        return num;
    }
    static String check(int num)
    {
    	String res="";
        if(num%3==0)
        	res=num+"는(은)3의 배수입니다";
        else 
        	res=num+"는(은) 3의 배수가 아닙니다";
        return res;
    }
    static void print(String res)
    {
    	 System.out.println(res);
    }
    static void process()
    {
    	int num=userInput();
    	String res=check(num);
    	print(res);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		/*Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
        int num=scan.nextInt();
        
        String res="";
        if(num%3==0)
        	res=num+"3의 배수입니다";
        else 
        	res=num+"3의 배수가 아닙니다";
        System.out.println(res);*/
        

	}

}
