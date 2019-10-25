package strings;
import java.io.*;
import java.util.regex.*;
import static lzp.tools.*;
import lzp.*;
import static lzp.tools.print;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lzp.TextFile;

public class jisuanfanghuofa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = TextFile.read("D:/scan/2.txt");
		String ss="";
		int i=0;
		double a=0,b=0,t=0;
		String s1[] = new String[1000] ;
		String sa[] = new String[1000] ;
		String sb[] = new String[1000] ;
		Matcher minput =Pattern.compile(".*",Pattern.DOTALL).matcher(s);
		if(minput.find()){
	//	print(minput.group());
		s1[i]=minput.group();
	//	print(s1[i]);
		i++;
		
		}
		
		
		
		
		Pattern p =Pattern.compile("\\d+[xX]\\d+");
		i=0;
		for (String stemp:s1){
	//		print(stemp);
			if(stemp!=null)
			{	
				Matcher m =p.matcher(stemp);
				while(m.find()){
					s=m.group();
	//				print(m.group());
					sa[i]=s.replaceAll("[xX]\\d+", "");
					sb[i]=s.replaceAll("\\d+[xX]", "");
					a=Integer.valueOf(sa[i]);
					b=Integer.valueOf(sb[i]);
					if(a*b>1000000)
						t=a*b*1140/1000000+380;
					else
						t=a*b*1220/1000000+330;
					
			//		t=a*b*290/1000000+35;
		//			print(sa[i],"         ",sb[i],"            ",t);
					print(String.format("%-15s    %-15s    %-6.2f",sa[i],sb[i],t));
					i++;
					
			}
			
			}
			
		}
	//	print(i);
		
		 
	}

}
