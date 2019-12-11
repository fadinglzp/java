package io;
import java.io.*;
import java.util.*;

public class RecoverCADState {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/io/CADState.out"));
		List<Class<? extends Shape>> shapeTypes=(List<Class<? extends Shape>>)in.readObject();
		Line.deserializeStaticState(in);
		List<Shape> shapes=(List<Shape>)in.readObject();
		System.out.println(shapes);
	}

}
