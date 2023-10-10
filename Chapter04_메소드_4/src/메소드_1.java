/*
  *    메소드 : 한개의 기능 수행하는 명령문의 집합
 *           ---------        ----- 변수,제어문,연산자
 *    1) 메소드 구조
 *       [접근지정어][옵션] 리턴형 메소드명(매개변수목록) ==> 선언문
 *       {
 *          구현
 *          ...
 *          ...
 *          ...
 *          return 값;
 *          => void로 선언시에는 return을 생략할 수 있다
 *                            -------------
 *                              | 컴파일러에 의해 자동 추가
 *          => return 문장은 메소드의 종료(반드시 필요)                     
 *       }
 *       
 *       메소드 : 호출 => 메소드는 처음부터 끝까지 실행을 하고
 *                     원래 호출한 위치로 넘어 온다
 *       예)
 *           void aaa()
 *           {
 *              1문장 --------2 --> 7
 *              2문장 --------3 --> 8
 *              3문장 --------4 --> 9
 *              retrun; --- 메소드 종료 => 호출 위치 돌아간다
 *           }
 *           void main()
 *           {
 *              4문장 --------1
 *              aaa()
 *              5문장 --------5
 *              6문장 --------6
 *              aaa() -------10
 *              7문장
 *           }    
 *           => 반복적인 문장이 있는 경우 (반복 제거)
 *           => 기능별 분리하기 때문에 코드가 간결하다
 *              -------- 수정하기 편히하다 , 에러처리 편리
 *           => 다른 클래스와 연결시에 주로 사용
 *           => 객체 지향 : 변수 / 메소드
 *           => 클래스의 구성 : 변수/메소드
 *           => 메소드가 존재하면 좋은 점 : 분산이 가능 (여러명이 동시 개발이 가능)
 *           
 *                
 *    2) 리턴형 결정
 *       사용자가 요청에 대한 결과값을 도출
 *       => 한개만 설정이 가능
 *          : 여러개 => 묶어서 전송
 *                    ---------- 한개로 인식 (배열,클래스)
 *       예)
 *           => 사용자 정의 데이터형
 *           class Movie{
 *                 String title;
 *                 String director;
 *                 String actor;
 *                 double score;
 *                 int rank
 *           }
 *       = 결과값이 있는 경우 => 결과값 설정 
 *                           = 기본형
 *                           = 배열 
 *       = 결과값이 없는 경우 (메소드 자체에서 처리) => void
 *         void => 결과를 메소드에서 출력
 *       = 리턴형과 결과값은 가급적이면 동일
 *         *** 리턴형 => 결과값 => 예측을 못할 수도 있따
 *         예) int 메소드명()
 *            ---- 리턴형 (long,double,float)
 *            {
 *               return 값;
 *                     --- 결과값
 *            }
 *            *** boolean / String => 대체할 수 없다
 *                                  
 *    3) 매개변수 : 사용자로부터 요청을 받은 값
 *                ---------------------
 *                 예)
 *                    로그인 요청 => ID,PWD
 *                    아이디 체크 => ID
 *                    우편번호 검색 => 동/읍/면
 *                    영화 검색 => 검색어 
 *                 => 여러개를 사용할 수 있다
 *                 => 가급적이면 매개변수는 적게 사용하는 것이 좋다
 *                            -------------------
 *                                  | 3개 정도
 *                                  => 배열 , 클래스
 *                 => 예측을 못하는 경우
 *                    -------------- => 가변 매개변수 (...)                  
 *                                     
 *    4) 메소드명 
 *       => 식별자 이용 (변수명칭법과 동일)
 *          ---------
 *          1. 알파벳이나 한글로 시작한다
 *             ----- 운영체제에 영향이 없다 (윈도우,리눅스,맥)
 *             ----- 소프트웨어 이식(개발 => 윈도우->리눅스)
 *             => 알파벳은 대소문자 구분
 *          2. 숫자 사용이 가능 (앞에 사용 금지)
 *          3. 특수문자 사용이 가능 ( _ , $)
 *          4. 키워드는 사용할 수 없다
 *             ----- 변수명 , 메소드명 , 클래스명 (X)
 *          5. 공백은 없어야 한다
 *          6. 메소드명의 길이는 제한은 없다
 *             => 적절한 크기로 설정 (3~15)
 *             => 추가 (board_insert , boardInsert)
 *          7. 약속
 *             => 소문자로 시작한다
 *             => 두개 단어일 경우 => 두번째 단어의 첫자 대문자
 *                ----------------- 헝거리어식 표기법
 *        ===> 변수/상수/메소드/클래스/인터페이스/열거형
 *                    
 *    5) 호출 => 실행과정
 *       -------------
 *       int max(int a,int b)
 *       {
 *           return a>b?a:b
 *       }
 *       => int max=max(10,20) => a=10 , b=20
 *          --- ---- a>b?a:b
 *           | 클 수도 있다 (double,long...)
 *       void max(int a,int b)
 *       {
 *            System.out.println(a>b?a:b)
 *       }
 *       
 *       => max(10,20) => 받아서 저장하는 값이 없다
 *    6) 메소드 유형 
 *       ---------
 *         리턴형     매개변수
 *         ----------------
 *          O        O
 *            => String 
 *               String substring(int begin)
 *               String substring(int begin,int end)
 *               ------------------ 메소드명이 동일 => 매개변수가 다르다
 *                                  => 메소드가 다르다 (오버로딩)
 *          O        X
 *            => Math
 *               double random() => 임의의 데이터 추출
 *               ------ 0.0~0.99
 *          -------------------------
 *          X        O
 *            => 출력담당 
 *               void println(String s)
 *          X        X => 빈도수가 없다
 *          ------------------------- void (INSERT,UPDATE,DELETE)
 *          파일에 값 추가 , 파일 값 삭제 , 수정
 *             void println() => 다음줄에 출력
 *             -------------- 원형
 *               = 사용자 정의
 *               = 라이브러리 => 어떤 기능 , 원형 (리턴형,매개변수)
 *                 -------- 70% => CBD
 *                                 Component => 기능이 있는 클래스        
 */
// => 모든 프로그램
/*
 *   입력 : 사용자로부터 전송 ==> 매개변수
 *         => Scanner , BufferedReader , Random
 *                      ---------------
 *                        | 예외처리 , io
 *         => 윈도우 , 웹 => 입력창 => 버튼 / 엔터
 *            ---------
 *             <input type=text>
 *             <input type=password>
 *             <input type=button> 
 *   처리 (요청처리) => 결과값 , 결과값이 없는 경우 => 여러개로 나눠서 처리
 *                   ----   ---------------
 *                    |
 *                   출력하는 메소드                          
 */
// 1. 매개변수(X) , 리턴형(X) => 자체 출력
// ==> 리턴형이 없는 경우가 많이 존재 => 변수 전역
public class 메소드_1 {
    //static int a=10;
    /*static int aaa()
    {
    	int a=100;
    	return a;
    }*/
	// 구구단 전체
	static void gugudan()
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%2d*%2d=%2d\t",j,i,j*i);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int a=aaa(); // a변수는 사라진다
        //System.out.println("a="+a);
		gugudan();
	}

}
