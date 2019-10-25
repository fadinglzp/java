package strings;
import static lzp.tools.*;
public class IntegerMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("-123".matches("-?\\d+"));
		print("-123".matches("-?\\d"));//false
		print("-1".matches("-?\\d"));
		print("123".matches("-?\\d+"));
		print("123".matches("-\\d+"));//false
		print("-1".matches("-?\\d+?"));//ture
		print("-123".matches("-?\\d?"));//false
		print("-".matches("-?\\d?"));//ture
		print("-123".matches("-?\\d+?"));//true
		print("--".matches("-?\\D+?"));//true
		print("-A1".matches("-?\\D+?\\d+?"));//true
		print("-A1".matches("-\\D+?\\d+?"));//true
		print("-A1a".matches("-?\\D+?\\d+?"));//false
		print("-1A".matches("-?\\D+?\\d+?"));//false
		print("-1".matches("-?\\D+?"));//false
		print("-adfads43534".matches("-\\w+"));
		print("+123".matches("(\\+|-)?\\d+"));
		print("\\".matches("\\\\"));
		print("-1".matches("\\d+"));//false
		print("Adfkgjhdfjgkds123456-=-=-   .".matches("[A-Z].+\\."));
		print("Adfkgjhdfjgkds123456-=-=-   .1".matches("[A-Z].+\\."));
		print("adfkgjhdfjgkds123456-=-=-   .".matches("[A-Z].+\\."));
		print("-".matches("-\\d+?"));
		print("-".matches("-\\d++"));
		print("-1".matches("-\\d+?"));
		print("-1".matches("-\\d++"));
		print("-".matches("-\\d*"));
		print("-1".matches("-\\d+"));
		print("abc".matches("(?i)[A-Z]+"));
		print("abc".matches("(?u)[A-Z]+"));
		print("abc\r".matches("(?d).*"));
	}

}
