package io;
import java.io.*;
import static lzp.tools.*;


public class Blip3 implements Externalizable {
	private int i;
	private String s;
	public Blip3(){
		print("Blip3 Constructor");
	}
	public Blip3(String x,int a){
		s=x;
		i=a;
	}
	public String toString(){
		return s+i;
	}
	public void writeExternal(ObjectOutput out) throws IOException{
		print("Blip3.writeExternal");
		out.writeObject(s);
		out.writeInt(i);
	}
	public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException
	{
		print("Blip3.readExternal");
		s=(String) in.readObject();
		i=in.readInt();
	}
	public static void main(String[] args)  throws IOException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
		print("Constructing objects:");
		Blip3 b3=new Blip3("A String ",47);
		print(b3);
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(
				"src/io/Blip3.out"));
		print("Saving object:");
		o.writeObject(b3);
		o.close();
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(
				"src/io/Blip3.out"));
		print("Recovering b3:");
		b3=(Blip3)in.readObject();
		print(b3);
	}

}
