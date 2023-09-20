
public class 문제14_15_16_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print(i);
				else
					System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		char c='A';
		for(int i=1;i<=5;i++)
		{
			c='A';
			for(int j=1;j<=5;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
		System.out.println();
		c='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(c);
			}
			c++;
			System.out.println();
		}
	}

}
