package funmain;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="d",s1,s2,s5="123";
		char c='e',cc;
		char[] c1={'f',' ','g'},c2;
		cc=s5.charAt(0);
		c2=s5.toCharArray();
		System.out.println(cc);
		System.out.println(c2);
		s1=Character.toString(c);
//error 			s2 = (String)c1;
//wrong				s2=c1.toString();	c1µÄµØÖ·toString
		s2=String.valueOf(c1);
		Other.main(new String[]{"a","b","c",s,s1,s2,new String(new char[]{c}),new String(c1)});
	}

}

class Other{
	public static void main(String[] args){
		for(String s : args){
			System.out.print(s+" ");
		}
	}
}
