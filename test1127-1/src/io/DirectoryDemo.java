package io;

import java.io.*;
import lzp.*;
import static lzp.tools.*;

public class DirectoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PPrint.pprint(Directory.walk(".").dirs);
		print("---------------------------------");
		for(File file:Directory.local("src/lzp", "T.*"))
			print(file);
		print("---------------------------");
		for(File file: Directory.walk(".","T.*\\.java"))
			print(file);
		print("===========================");
		for(File file: Directory.walk(".",".*[Zz].*\\.class"))
			print(file);

	}

}
