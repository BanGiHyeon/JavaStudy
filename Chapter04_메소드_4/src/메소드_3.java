// 숫자야구게임
import java.util.Arrays;
import java.util.Scanner;
/*
 *   1. 컴퓨터가 임의로 난수 발생 => []
 *   2. 사용자가 입력
 *   3. 힌트
 *   4. 종료여부
 *   5. 조립
 */
public class 메소드_3 {
    static int[] getRand()
    {
    	int[] com=new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		return com;
    }
    static int[] userInput()
    {
    	int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			// 배열에 입력된 값을 저장
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("같은 수는 사용할 수 없습니다");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0을 사용할 수 없습니다");
				continue;
			}
			break;
		}
		return user;
    }
    static int hint(int[] com,int[] user)
    {
    	int s=0,b=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(com[i]==user[j])
				{
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
		System.out.printf("Input Number:%d%d%d,Result:%dS-%dB\n",user[0],user[1],user[2] , s , b);
		return s;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 컴퓨터가 임의로 난수 발생
		int[] com=new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(com));
		// 사용자 요청
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			// 배열에 입력된 값을 저장
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("같은 수는 사용할 수 없습니다");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0을 사용할 수 없습니다");
				continue;
			}
			
			// hint 제공
			int s=0,b=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			// 힌트 출력
			System.out.printf("Input Number:%d,Result:%dS-%dB\n",input , s , b);
			// 종료여부 확인
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
		}
	}

}
