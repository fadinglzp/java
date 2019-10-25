package strings;
import java.util.regex.*;
import static lzp.tools.*;

public class testregex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= new String[]{"abcababcabcabcdefabcccccz","abc+","(abc)+","(abc){2,}","(abc){2,}+","(abc){2}","(abc)+?","abc+?","ab.*z"
				,"ab.*?z","ab.*+z","ab[a-s]{5,10}+z","^a|\\Gb|z$"};
		for(String sf:s){
			print("Regular expression: \""+sf+"\"");
			Pattern p =Pattern.compile(sf);
			Matcher m =p.matcher(s[0]);
			while(m.find()){
				print("March\""+m.group()+"\" at positions "+m.start()+"-"+(m.end()-1));
			}
		}
		String[] s1 =new String[]{
			"chu shi biao �ȵ۴���ҵδ��xu �ȵ۴���ҵδ���� zhugeliang",	"\\bc","\\b.\\Bh[a-z]*","��",
			"\\b��","\\b��.+��","\\b��[\u4E00-\u9FA5]*��\\s","\\b��[\u4E00-\u9FA5]*��\\s","\\W+","[\u4E00-\u9FA5]++x",
			"[\u4E00-\u9FA5]+��","[\u4E00-\u9FA5]++��","[\u4E00-\u9FA5]+?��","[\u4E00-\u9FA5]*?��","[\u4E00-\u9FA5]+��\\b",
			"\\Bu\\B","\\w+u\\w+","[^\\s]*u[^\\s]*"
		};
		for(String sf:s1){
			print("Regular expression: \""+sf+"\"");
			Pattern p =Pattern.compile(sf);
			Matcher m =p.matcher(s1[0]);
			while(m.find()){
				print("March\""+m.group()+"\" at positions "+m.start()+"-"+(m.end()-1));
			}
		}

	}

}
