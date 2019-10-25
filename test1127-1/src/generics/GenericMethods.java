package generics;

public class GenericMethods {
	public <T> void f(T x){
		System.out.println(x.getClass().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethods gm =new GenericMethods();
		gm.f("");
		gm.f(1.0);
		gm.f(1.0F);
		gm.f(gm);
	}

}
