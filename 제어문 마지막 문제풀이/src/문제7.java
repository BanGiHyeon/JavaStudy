
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		while(true)
		{
			int a=(int)(Math.random()*6)+1;
			int b=(int)(Math.random()*6)+1;
			count++;
			System.out.println("a="+a+",b="+b);
			if(a==b)
			{
				break;
			}
		}
        System.out.println("count="+count);
	}

}
