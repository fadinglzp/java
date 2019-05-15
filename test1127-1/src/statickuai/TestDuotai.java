package statickuai;

import static lzp.tools.*;
class TestDuotaiA{
	void fun2()
	{
		print("A");
	}
}
class Duotaifun1{
	void fun1(){
		print("1fun1");
		fun2(1);
	}
	void fun2(int i){
		print("1fun2");
	}
}

class Duotaifun2 extends Duotaifun1{
	void fun1()
	{
		print("2fun1");
		fun2(1);
	}
	void fun2(){
		print("2fun2");
	}
}


public class TestDuotai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duotaifun1 df=new Duotaifun2();
		df.fun1();
	}

}
