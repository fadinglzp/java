package arrays;
import static lzp.tools.*;
import java.util.*;

public class CopyingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i =new int[7];
		int[] j=new int[10];
		Arrays.fill(i, 47);
		Arrays.fill(j, 99);
		int t=i.length;
		for(;t-->0;)
			i[t]=t+1;
		t=j.length;
		for(;t-->0;)
			j[t]=t+101;
		print(Arrays.toString(i));
		print(Arrays.toString(j));
		print(i.getClass().getSimpleName());
		System.arraycopy(i, 1, j, 2, i.length-2);
		print(Arrays.toString(i));
		print(Arrays.toString(j));
		int[] jj=new int[10];
		System.arraycopy(j, 0, jj, 0, j.length);
		print(Arrays.equals(j, jj));
		String[] s1=new String[4];
		Arrays.fill(s1, "A");
		print(s1);
		String[] s2=new String[]{
				"A",	"A","A","A"
		};
		print(s2);
		print(Arrays.equals(s1, s2));
		String ss1="ABC";
		String ss2="A";
		String ss3="ABC";
		ss2+="BC";
		print(ss1==ss2);
		print(ss1.equals(ss2));
		
		print(s1[1]==s2[2]);
	}

}

