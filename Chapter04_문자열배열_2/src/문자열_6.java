import java.io.*;
import java.util.*;
public class 문자열_6 {
    static String seoulData="";
    static
    {
    	try
    	{
    		FileReader fr=new FileReader("C:\\javaDev\\seoul_location.txt");
    		int i=0;
    		while((i=fr.read())!=-1)
    		{
    			seoulData+=(char)i;
    		}
    		fr.close();
    	}catch(Exception ex){}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(seoulData);
		//1. 페이징 기법 => 10page
		String[] seoul=seoulData.split("\n");
		Scanner scan=new Scanner(System.in);
		int curpage=1;
		int totalpage=(int)(Math.ceil(seoul.length/10.0));
		//System.out.println("총페이지:"+totalpage);
        while(true)
        {
		System.out.print("페이지 선택(1~"+totalpage+"):");
		curpage=scan.nextInt();
		if(curpage<1 || curpage>28)
		{
			System.out.println("프로그램을 종료합니다!!");
			break;
		}
		final int ROW=10;
		int j=0;
		int pagecnt=(curpage*ROW)-ROW;
		for(int i=0;i<seoul.length;i++)
		{
			String[] ss=seoul[i].split("\\|");
			if(j<ROW && i>=pagecnt)
			{
				System.out.println(ss[0]+"."+ss[1]);
				j++;
			}
		}
        }
	}

}
