package com.sist.lib;
/*
 *   java.lang => 자바 소스의 기본 => 많이 사용이 되는 패키지 
 *             => import를 생략할 수 있다
 *             => java.lang에 있는 대부분의 클래스는 
 *                final클래스가 많다 
 *                ---------- 확장이 불가능 있는 그대로 사용(암기)
 *                String , StringBuffer , Math , System
 *                Wrapper
 *                예외 : Object
 *   => Object : 최상위 클래스 => 모든 클래스의 상위 클래스
 *               (사용자 정의 , 라이브러리 => 모든 클래스 Object로부터 상속을 받는다)
 *               = toString() : 객체를 문자열화 
 *                              기본은 메모리 주소 출력
 *                              => 오버라이딩(멤버변수 값 확인)
 *               = clone() : 메모리 주소를 복제 => 새로운 메모리 생성 
 *                 게임 (아바타) => 디자인 패턴 , 알고리즘 
 *                               ------------------- 스프링전에
 *                 => 2023=>문법 , 2024=>활용
 *               = finalize : 소멸자 (자동 호출) => 메모리 해제시 자동 호출
 *   => System : 출력 , 메모리 해제 , 프로그램 종료
 *               = *** println() : => 에러 출력
 *                                 => 멤버변수 값 확인
 *                                 => 전송 값 확인 
 *                 윈도우 / 브라우저 => 자체 출력 => 디버깅 
 *               = gc() : 가비지 컬렉션을 호출 메모리를 비워준다
 *                 => 멀티미디어 , 애니메이션 
 *                    ==> 실시간 도로 cctv
 *               = exit() => 종료
 *                    ---- 0(정상) , 비정상 
 *   => Math : 수학 => 모든 메소드가 static
 *             => 메모리 할당을 하지 않는다
 *             => Math.메소드명()
 *             = *** random() => 리턴형(double=>0.0~0.99)
 *             = *** ceil() => 올림 => 총페이지 
 *   => StringBuffer : String을 봐완 => 문자열 결합시 최적화 
 *             => *** append()
 *   => String : 문자열 관리하는 클래스 
 *  // 문제 풀이  
 *   1. public boolean startsWith(String s)
 *   
 *   2. public boolean endsWith(String s)
 *   
 *   3. 객체 생성
 *      -------
 *        => 모든 값을 저장 할 수 없다
 *        => 모든 값을 저장하기 위해 => 메모리를 모아서 저장
 *                                 --------------- Heap
 *        => 객체에는 heap에 저장되어 있는 메모리 주소를 가지고 있다
 *                                    -------- 참조 변수
 *        (주소 비교시에는 == , 실제 저장된 값을 비교 equals)
 *        *** public boolean equals(String s)
 *            => 웹 : 로그인 , 아이디 찾기 , 아이디 중복 ...
 *               -- CRUD (게시판) => 회원가입 => 로그인
 *               -- 목록 (페이지 나누기) => 상세보기 (댓글)
 *               -- 최신방문 (쿠키) , 로그인 상태 유지(세션)
 *            => 대소문자를 구분해서 비교  
 *                                      
 *   4. String => char[]을 비교해서 이용한 클래스 
 *                ------
 *                 => 문자열 번호 => 0번부터 시작
 *      String s="Hello Java";
 *                0123456789
 *             => {'H','e','l','l','o'...}   
 *      public char charAt(int index)
 *      
 *   5. *** public int lastIndexOf(char c)
 *      public int lastIndexOf(String s)
 *      --------------------------------
 *        오버로딩 => 객체지향의 3대 특성(다형성) => 오버라이딩(재정의)
 *          = 한 클래스에서 만들어 진다
 *          = 같은 메소드명 이용
 *            버스 => 버스(좌석) , 버스(마을) , 버스(고속)
 *          = 매개변수의 갯수나 데이터형이 다른 경우 
 *          = 리턴형은 관계없다 
 *          = 접근지정어도 관계없다 
 *            대표적) 생성자 , println() 
 *          = 중복메소드 정의
 *          = 면접 => 협업 / 프로젝트의 어려운점
 *            => 형상관리(GIT)
 *            
 *   6. =>length()
 *      => *** public int length()
 *      => 비밀번호 / 글쓰기 ....
 *                  -----오라클의 지정된 문자 갯수 초과
 *                  => 오라클은 문자의 개수 지정
 *                  => title VARCHAR2(1000) => 한글은 300글자만 사용이 가능
 *                     => 한글은 3byte
 *         ------ 8자리
 *         
 *   7. => replace : 변경 
 *         public String replace(char c)
 *         public String replace(String s)
 *         => 오라클 => 값을 저장 
 *                    -------- 이미지 => & , ||
 *                    & => Scanner
 *                    || => 문자열 결합 
 *   
 *   8. => repalceAll(String regexp,String s)
 *                    -------------- 정규식 , split()
 *                    공부 : 데이터 분석 (챗봇)
 *                          ---------
 *         => 패턴 (문자열의 형태)
 *         => 맛집 => 어떤 맛 
 *                   짜다 , 싱겁다 , 맵다...
 *                   ---
 *                   짜다 , 짜고 , 짜니 ....
 *                   짜+
 *         => 기호 (+,*,^,$,.,|) ==> 자체 => \\+
 *   
 *   9. public String[] split(String regexp) => 정규식 이용
 *      => java.util => ***StringTokenizer
 *   
 *   10. public String substring(int b)
 *         => b부터 전체 반환
 *       public String substring(int b,int e) 
 *         => b부터 시작 ~ e-1까지 반환
 *                       ----
 *       *** 원본은 변경되지 않는다 
 *       String s="Hello Java";
 *                 0123456789
 *       s.substring(6) => Java
 *       
 *   11. toLowerCase()
 *   
 *   12. toUpperCase()
 *   
 *   13. ** public String trim() => 좌우에 있는 공백만 제거 
 *   
 *   14. toString() => Object가 가지고 있는 toString() 오버라이딩 
 *       ---------- 문자열 반환 => 데이터형을 문자형으로 변경
 *       
 *   15. *** public boolean contains(String s)
 *       
 *   16. public char charAt(int index)
 *           
 *   17. public String concat(String s) ==> +
 *          => MySQL은 문자열 결합 => concat()
 *          => 오라클 => ||
 *        String s="A";
 *        String s1="B";
 *        s.concat(s1) => "AB"
 *        
 *   18. String.format("%d%d%d",10,20,30)
 *       ------ static
 *       public static String format(String s,Object...obj)
 *       ...은 가변 매개변수 
 *       
 *   Object 클래스의 주요 메소드
 *   
 *   1. ***clone()
 *   
 *   2. equals()
 *   
 *   3. finalize()
 *   
 *   4. toString()
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Hello Java";
        s=s.substring(6);
        System.out.println(s.substring(6));
        System.out.println(s);
	}

}
