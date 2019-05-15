import java.util.*;

public class t1 {
	public static  void main(String[] args){
		
		int i=0,j=0;
		ssout:
			while(true){
		//		label1:	
//				while(i<10){
//					i++;
//					continue ssout;
//					}
				label2:
				for(;true;j++){
					System.out.println(j);
					ssin:
						for(i=1;true;i++)
						{
							System.out.println(i);
							if(i==3) {
								i++;
								continue ssin;
								//continue label2;
							}
							if(i==5) {
								i++;
								continue ssout;
								
							}
							if(i==7) {
								i++;
								break ssin;
							}
							if(i==9) {
								i++;
								break ssout;
							}
						
						}
				}
			}
//	Integer n1 =new Integer(47);
//	Integer n2 =new Integer(47);
//	TDate td1=new TDate(3);
//	byte b1=-1;
//	
//	byte b2=-2;
//	b2>>>=1;
//	int i=0x7fffffff;
//	System.out.println(i);
//	System.out.println(Integer.toBinaryString(i));
//	i<<=1;
//	System.out.println(i);
//	System.out.println(Integer.toBinaryString(i));
//	System.out.println(Integer.toBinaryString(b1));
//	System.out.println(Integer.toBinaryString(b2));
//	System.out.println(n1==n2);
//	System.out.println(new Date());
//	System.out.println(td1.a);
//	System.out.println(new Integer(47));
}
}
