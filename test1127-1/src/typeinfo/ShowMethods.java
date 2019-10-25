package typeinfo;

import java.lang.reflect.*;
import java.util.regex.*;
import static lzp.tools.*;

public class ShowMethods {
	private static String usage = "usage:\n" + "ShowMethods qualified.class.name\n"
			+ "To show all methods in class or:\n" + "ShowMethods qualified.class.name word\n"
			+ "To search for methods involving 'word'";
	private static Pattern p = Pattern.compile("\\w+\\.");
	public void fun(){}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines =0;
		String[] input =new String[]{"ShowMethods"};
		try{
			if(args.length<1){
				print(usage);
				System.exit(0);
			}
			print(args.length);
//			Class<?> c=Class.forName(input[0]);
			Class<?> c=Class.forName(args[0]);

			Method[] methods=c.getMethods();
			Constructor[] ctors =c.getConstructors();
			if(args.length==1)
			{
				for(Method method:methods)
					print(p.matcher(method.toString()).replaceAll(""));
				for(Constructor ctor:ctors)
					print(p.matcher(ctor.toString()).replaceAll(""));
				lines=methods.length+ctors.length;
			}else{
				for(Method method:methods){
					//print();
					if(method.toString().indexOf(args[1])!=-1){
						print(p.matcher(method.toString()).replaceAll(""));
						lines++;
					}
						
					}
				for(Constructor ctor:ctors)
					if(ctor.toString().indexOf(args[1])!=-1){
						print(p.matcher(ctor.toString()).replaceAll(""));
						lines++;
					}
				
			}
			}catch(ClassNotFoundException e){
				e.printStackTrace();
		}
}

}
