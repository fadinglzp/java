package lzp;
import java.io.BufferedReader;
import java.io.FileReader;
public class TextFile {
//	private String s = "";
//	private BufferedReader in;
//
//	public String toString() {
//		return s;
//	}

	public static String read(String filename) {
		String sr = "";
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(filename));
			String tmp;
			while ((tmp = in.readLine()) != null)
				sr += tmp+"\n";
			in.close();
		} catch (Exception e) {
			e.printStackTrace(System.err);
			// s="";
			// try {
			// in.close();
			// } catch (IOException e2) {
			// print("in.close() unsuccessful");
			// }
		}
		return sr;
	}

	public TextFile(String filename) {
/*
		try {
			in = new BufferedReader(new FileReader(filename));
			String tmp;
			while ((tmp = in.readLine()) != null)
				s += tmp;
			in.close();
		} catch (Exception e) {
			// s="";

			e.printStackTrace(System.err);
			// try {
			// in.close();
			// } catch (IOException e2) {
			// print("in.close() unsuccessful");
			// }
		} finally {

		}
*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
