package io;

import java.util.*;
import java.util.concurrent.*;
import java.io.*;
import static lzp.tools.*;

public class Logon implements Serializable {

	private Date date = new Date();
	private String username;
	private transient String password;

	public Logon(String name, String pwd) {
		username = name;
		password = pwd;
	}

	public String toString() {
		return "logon info: \n  username: " + username + "\n  date: " + date + "\n  password: " + password;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Logon a = new Logon("Hulk", "myLittlePony");
		print("logon a = " + a);
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("src/io/Logon.out"));
		o.writeObject(a);
		o.close();
		TimeUnit.SECONDS.sleep(1);
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/io/Logon.out"));
		print("Recovering object at "+new Date());
		a=(Logon)in.readObject();
		print("logon a = "+a);
	}

}
