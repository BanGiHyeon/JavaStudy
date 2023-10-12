package com.sist.manager;
// 같은 패키지상에 있는 경우 => default/public/protected
// import를 사용하지 않는다
// => 프랜들리
/*
 *     캡슐화 / 오버라이딩 / 상속 / 포함
 *     -----  --------         ---
 *                        | POJO
 *      *** 1) 결합성
 *      2) 응집성
 *      *** 3) 가독성
 *      4) 최적화
 * 
 */
import java.util.*;
public class StudentSystem {
    public Student[] students=new Student[3];
    // 입력
    public void input()
    {
    	Scanner scan=new Scanner(System.in);
    	for(int i=0;i<students.length;i++)
    	{
    		students[i]=new Student();
    		System.out.println("학번 입력:");
    		students[i].hakbun=scan.nextInt();
    		
    		System.out.println("이름 입력:");
    		students[i].name=scan.next();
    		
    		System.out.println("국어 입력:");
    		students[i].kor=scan.nextInt();
    		
    		System.out.println("영어 입력:");
    		students[i].eng=scan.nextInt();
    		
    		System.out.println("수학 입력:");
    		students[i].math=scan.nextInt();
    	}
    }
    
}
