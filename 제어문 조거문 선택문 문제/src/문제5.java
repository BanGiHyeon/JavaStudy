public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*51)+50;
		int b=(int)(Math.random()*51)+50;
		int c=(int)(Math.random()*51)+50;
		System.out.println("a 점수:"+a);
		System.out.println("b 점수:"+b);
		System.out.println("c 점수:"+c);
		System.out.println("총점:"+(a+b+c));
		double avg=(a+b+c)/3.0;
		System.out.printf("평균:%.2f\n",avg);
		
		char score='A';
		if(avg>=90)
			score='A';
		else if(avg>=80)
			score='B';
		else if(avg>=70)
			score='C';
		else if(avg>=60)
			score='D';
		else
			score='F';
		System.out.println("학점:"+score+"학점");

	}

}
