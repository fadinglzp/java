package testclass;

import static lzp.tools.print;

public  class Apple implements testA{
	String name;
	public Apple(){}
	public Apple(String s){
		name=s;
	}
	void fun1(){
		print("Apple");
	}
	public void funa(){
		print("1");
	};
	public String toString()
	{
		return name;
	}
}
