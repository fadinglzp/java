package strings;
import java.io.*;
import java.util.regex.*;
import static lzp.tools.*;
import lzp.*;
public class jisuan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = TextFile.read("D:/scan/1.txt");
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
//		print(s1[i]);
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
					t=a*b*290/1000000+35;
					print(sa[i],"       ",sb[i],"            ",t);
					i++;
					
			}
			
			}
			
		}
		//print(i);
	}

}
