package generics;

class HoldItem<T>{
	T item;
	HoldItem(T item){
		this.item=item;
	}
	T getItem(){
		return item;
	}
}
class Colored2<T extends HasColor> extends HoldItem<T>{
	
	Colored2(T item) {
		super(item);
		// TODO Auto-generated constructor stub
	}

	java.awt.Color color(){
		return item.getColor();
	}
}
class ColoredDimension2<T extends Dimension & HasColor> extends Colored2<T>{

	ColoredDimension2(T item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
	int getX(){
		return item.x;
	}
	int getY(){
		return item.y;
	}
	int getZ(){
		return item.z;
	}
	
}

class Solid2<T extends Dimension & HasColor & Weight> extends ColoredDimension2<T>{

	Solid2(T item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
	int wight(){
		return item.weight();
	}
	
}





public class InheritBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solid2<Bounded> solid2=new Solid2<Bounded>(new Bounded());
		
		
		
		
		
		
	}

}
