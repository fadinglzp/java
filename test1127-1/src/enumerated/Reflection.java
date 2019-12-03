package enumerated;
import java.lang.reflect.*;
import java.util.*;
import lzp.*;
import static lzp.tools.*;

enum Explore{ HERE,THERE}
enum Search{HITHER,YON}

public class Reflection {
	public static Set<String> analyze(Class<?> enumClass){
		print("----- Analyzing "+enumClass+ " -----");
		print("Interfaces: ");
		for(Type t: enumClass.getGenericInterfaces())
			print(t);
		print("Base: "+enumClass.getSuperclass());
		print("Methods: ");
		Set<String> methods =new TreeSet<String>();
		for(Method m: enumClass.getMethods())
			methods.add(m.getName());
		print(methods);
		return methods;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Search[] vals=Search.values();
		Enum e= Search.HITHER;
		for(Enum en:e.getClass().getEnumConstants())
			print(en);
		Class<Integer> intClass=Integer.class;
		try{
			for(Object en : Integer.class.getEnumConstants())
				print(en);
		}catch(Exception e1){
			print(e1);
		}
		
		
		/*
		Set<String> exploreMethods =analyze(Explore.class);
		Set<String> enumMethods=analyze(Enum.class);
		print("Explore.containsAll(Enum)? "+exploreMethods.containsAll(enumMethods));
		printl("Explore.removeAll(Enum) ");
		exploreMethods.removeAll(enumMethods);
		print(exploreMethods);
		
		
		*/
	}

}
