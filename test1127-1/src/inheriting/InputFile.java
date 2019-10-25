package inheriting;
import java.io.*;
import static lzp.tools.*;
public class InputFile {
	private BufferedReader in;
	public InputFile(String fname)throws Exception{
		try{
			in = new BufferedReader(new FileReader(fname));
		}catch(FileNotFoundException e){
			print("Could not open "+fname);
			throw e;
		}catch(Exception e){
			try{
				in.close();
				
			}catch(IOException e2){
				print("in.close() unsuccessful");
			}
			throw e;
		}finally{
			
		}
	}
	public String getLine(){
		String s;
		try{
			s=in.readLine();
			
		}catch(IOException	e){
			throw new RuntimeException("readLine() failed");
		}
		return s;
	}
	public void dispose(){
		try{
			in.close();
			print("dispose() successful");
		}catch(IOException e){
			throw new RuntimeException("in.close failed");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputFile in =new InputFile("D:/1.txt");
			try{
				String s;
				while((s=in.getLine())!=null){
					print(s);
				}
			}catch(Exception e){
				print("Caught Exception in main");
				e.printStackTrace(System.out);
			}finally{
				in.dispose();
			}
		}catch(Exception e){
			print("InputFile construction failed");
		}
	}

}
