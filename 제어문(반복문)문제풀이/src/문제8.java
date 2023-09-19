
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a7=0,sum=0;
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)
				{
				   a7+=i;
				   sum++;
				   
				}
		
		}
		System.out.println("7의 배수의 합:"+a7);
        System.out.println("7의 배수의 갯수:"+sum);
		
	}

	}

