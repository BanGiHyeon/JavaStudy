
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a2=0,count=0;
        for(int i=1;i<=100;i++)
        {
        	if(i%2==0)
        	{
        		a2+=i;
        		count++;
        	}
        }
        System.out.println("짝수들의 합:"+a2);
	}

}
