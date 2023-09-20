
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int count=0;
		for(int i=1;i<=10;i++)
		{
			int a=(int)(Math.random()*100)+1;
			if(a%2==0)
				count++;
		}
		System.out.println("\n결과값:"+count);*/
        int a3=0,a5=0;
        for(int i=1;i<=10;i++)
        {
        	int a=(int)(Math.random()*100)+1;
        	System.out.print(a+" ");
        	if(a%3==0)
        		a3++;
        	if(a%5==0)
        		a5++;
        }
        System.out.println("\n3의 배수 갯수:"+a3);
        System.out.println("5의 배수 갯수:"+a5);
        
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=10;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
