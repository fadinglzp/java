package testclass;

public class TestPet1 {
	public String name="A";
	public static  int length=1;
	public void setn(String n){
		name=n;
	}
	public String toString()
	{
		return name;
	}
	public static   TestPet1[] createArray(int ca){
	
		TestPet1[] tp=new TestPet1[ca];
		char c='A';
		for(int i=0;i<ca;i++){
			tp[i]=new TestPet1();
			tp[i].name=String.valueOf(c++);
		}
//		for (TestPet1 tp1 : tp) {
//			tp1=new TestPet1();
//			tp1.name=String.valueOf(c++);
//		}
		return tp;
	}
 
}
