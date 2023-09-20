
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,count=0;
		for(int i=3;i<=4462;i++)
		{
			if(i%2==0)
			{
				a+=i;
				count++;
			}
		}
		System.out.println("짝수인 정수의 합:"+a);

	}

}
