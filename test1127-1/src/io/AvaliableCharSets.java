package io;
import java.nio.charset.*;
import java.util.*;
import static lzp.tools.*;

public class AvaliableCharSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<String,Charset> charSets = Charset.availableCharsets();
		Iterator<String> it=charSets.keySet().iterator();
		while(it.hasNext()){
			String csName=it.next();
			printl(csName);
			Iterator aliases=charSets.get(csName).aliases().iterator();
			boolean	 hasnext=aliases.hasNext();
			if(hasnext){
				printl(": ");
				do{
					printl(aliases.next());
					hasnext=aliases.hasNext();
					if(hasnext)
						printl(", ");
				}while(hasnext);
			}
			print();
		}
	}

}
