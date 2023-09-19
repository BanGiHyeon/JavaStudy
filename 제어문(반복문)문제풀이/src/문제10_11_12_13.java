
public class 문제10_11_12_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====== 문제 10 =====");
		int a=0,b=0;
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
				a+=i;
			else
				b+=i;
		}
		System.out.println("1~30 짝수합"+a);
		System.out.println("1~30 홀수합"+a);
		
		System.out.println("====== 문제 11 =====");
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println("\n====== 문제 12 =====");
		a=b=0;
		for(int i=1;i<=1000;i++)
		{
			if(i%2==0)
				a+=i;
			if(i%9==0)
				b+=i;
		}
		System.out.print("7의 뱃의 합:"+a);
		System.out.print("9의 뱃의 합:"+a);
		System.out.print("7의 배수+9의배수:"+(a+b));
		
		System.out.println("\n====== 문제 13 =====");
		for(int i=10;i<=99;i++)
		{
			if(i%11==0)
				System.out.println(i);
		}
	}

}
