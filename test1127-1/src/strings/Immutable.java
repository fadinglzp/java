package strings;
import static lzp.tools.*;

class WhitherStringBuilder{
	public static String explicit(String[] fields){
		StringBuilder result=new StringBuilder("[");
		for(int i=0;i<fields.length;i++ ){
			result.append(fields[i]);
			result.append(", ");
			}
		result.delete(result.length()-2, result.length());
		result.append("]");
		return result.toString();
	}
}

public class Immutable {
	public static String upcase(String s){
		return s.toUpperCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q="howdy";
		print(q);
		String qq=upcase(q);
		print(qq);
		print(q);
	}

}
