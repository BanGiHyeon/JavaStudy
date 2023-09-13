/*
 *  증감 연산자
 *  int a=10;
 *  a++;
 *  ---------- a=a+1 ==> a+=1
 *  --- 1개증가 , 1개감소 ==> 반복문에서 주로 사용
 *       ++       --
 *  = 전치연산자
 *    ++a , --a
 *  = 후치연산자
 *    a++ , a--
 *    
 *  int a=10;
 *  int b = ++a ==> a를 먼저 증가하고 b에 대입
 *          ----
 *           1
 *      ---
 *       2
 *  ==> a=11 , b=11
 *  
 *  int a=10;
 *  int b = a++; ==> b에 a값을 대입후에 나중에 a값을 증가
 *       ---
 *        1
 *          --
 *          2
 *  ==> a=11 , b=10
 */
public class 증감연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=++a;
		System.out.println("a="+a+"b="+b);
		
		a=10;
		b=a++;
		System.out.println("a="+a+"b="+b);

	}

}
