
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a4=0,count=0;
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
			{
				a4+=i;
				count++;
			}
			System.out.println("100~999까지 4의 배수가 아닌 수의 합:"+a4);
	        System.out.println("100~999까지 4의 배수가 아닌 수의 갯수:"+count);
		}

	}

}
