
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		System.out.println(a+","+b+","+c);
		System.out.println("합계:"+(a+b+c));
		System.out.printf("평균:%.2f\n",(a+b+c)/3.0);
		
		int max=a;
		if(max<a)
			max=b;
		if(max<c)
			max=c;
		System.out.println("MAX:"+max);
		int min=a;
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		System.out.println("MIN:"+min);
		
		

	}

}
