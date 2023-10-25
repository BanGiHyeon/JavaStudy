package com.sist.seoul;
import java.util.*;
import java.io.*;
public class SeoulManager {
	public Seoul[] seoulAllData(int i)
	{
		Seoul[] seoul=null;
		String path="c:\\javaDev\\";
		if(i==1)
			path+="seoul_location.txt";
		else
			path+="seoul_nature.txt";
		FileReader fr=null;
		try
		{
			fr=new FileReader(path);
			String data="";
			int j=0;
			while((j=fr.read())!=-1)
			{
				data+=(char)j;
			}
			
			StringTokenizer st=new StringTokenizer(data,"\n");
			seoul=new Seoul[st.countTokens()];
			
			// 분리 => 데이터를 Seoul[]에 첨부
			i=0;
			// 분리
			String[] seouls=data.split("\n");
			
			for(String s:seouls)
			{
				st=new StringTokenizer(s,"|");
				seoul[i]=new Seoul();
				// 문자열 => 정수형으로 변경 Integer.parseInt()
				// token (단어) => String st.nextToken()
				seoul[i].setNo(Integer.parseInt(st.nextToken()));
				seoul[i].setName(st.nextToken());
				seoul[i].setContent(st.nextToken());
				seoul[i].setAddress(st.nextToken());
				i++;
			}
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
		
		
		return seoul;
	}
}
