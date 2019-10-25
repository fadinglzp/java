package typeinfo;

class Building {}
class House extends Building{
	public static int test=1;
	public House(){
		test++;
	}
	public void fun()
	{
		test++;
	}
	}

public class Classcast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building b=new House();
		System.out.println(((House)b).test);
		((House)b).fun();
		Class<House> houseType =House.class;
		Class<Building> buildingType =Building.class;
		House h=houseType.cast(b);
		Building b1=buildingType.cast(b);
		System.out.println(h.test);
		House h1=(House)b1;
		System.out.println(h==h1);
		System.out.println(b==b1);
	}

}
