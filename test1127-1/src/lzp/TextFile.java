package lzp;

import java.io.*;
import java.util.*;
import static lzp.tools.*;

public class TextFile extends ArrayList<String>{
	public static String read(String fileName){
		StringBuilder sb=new StringBuilder();
		try{
			BufferedReader in=new BufferedReader(new FileReader(
					new File(fileName).getAbsoluteFile()));
			try{
				String s;
				while((s=in.readLine())!=null)
				{
					sb.append(s);
					sb.append("\n");
				}
			}finally{
				in.close();
			}
		}catch(IOException e){
			throw new RuntimeException(e);
		}
		return sb.toString();
	}
	public static void write(String fileName,String text){
		try{
			PrintWriter out=new PrintWriter(new File(fileName).getAbsoluteFile());
			try{
				out.print(text);
			}finally{
				out.close();
			}
		}catch(IOException e)
		{
			throw new RuntimeException(e);
		}
	}
	//public TextFile
	
}





















//public class TextFile {
//	private static String s = "";
//	private BufferedReader in;
//
//	public String toString() {
//		return s;
//	}
//
//	public static String read(String filename) {
//		String sr = "";
//		BufferedReader in = null;
//		try {
//			in = new BufferedReader(new FileReader(filename));
//			String tmp;
//			while ((tmp = in.readLine()) != null)
//				sr += tmp+"\n";
//			in.close();
//		} catch (Exception e) {
//			e.printStackTrace(System.err);
//			 s="";
//			 try {
//			 in.close();
//			 } catch (IOException e2) {
//			 print("in.close() unsuccessful");
//			 }
//		}
//		return sr;
//	}
//
//	public TextFile(String filename) {
//
//		try {
//			in = new BufferedReader(new FileReader(filename));
//			String tmp;
//			while ((tmp = in.readLine()) != null)
//				s += tmp;
//			in.close();
//		} catch (Exception e) {
//			s = "";
//
//			e.printStackTrace(System.err);
//			 try {
//			 in.close();
//			 } catch (IOException e2) {
//			 print("in.close() unsuccessful");
//			 }
//		} finally {
//
//		}
//
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
