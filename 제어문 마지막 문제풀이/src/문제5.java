
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			int a=(int)(Math.random()*10)+1;
			System.out.print(a+" ");
			sum+=a;
		}
        System.out.printf("\n평균:%.1f\n",sum/10.0);
	}

}
