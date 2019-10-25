package typeinfo;
import java.util.*;
import static lzp.tools.*;
abstract class Shape{
	void draw(){
		print(this+".draw()");	
	}
	abstract public String toString();
//	public String toString(){return "Shape";};
}
class Circle extends Shape{
	public String toString(){
		return "Circle";
	}
}
class Square extends Shape{
	public String toString(){
		return "Square";
	}
}
class Triangle extends Shape{
	public String toString(){
		return "Triangle";
	}
}
public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape[]  sp = {new Triangle()};
		
		//declare object collection
				Collection<Shape> c1 = new ArrayList<Shape>();
				Collection<Shape> cal =new ArrayList<Shape>(Arrays.asList(new Circle(),new Circle(),new Square(),new Triangle()));
		
		//list
		List<Shape> shapelist = Arrays.asList(new Circle(),new Square(),new Triangle());
		for(Shape s:shapelist)
			s.draw();
		print("-----------------------");
		
		
		//maph
		Map<String,Shape> m =new HashMap<String,Shape>();
		int i=0;
		for(Shape s:shapelist)
			m.put(Integer.toString(i++), s);
		for(String k :m.keySet())
			m.get(k).draw();
		print("Hashtable-----------------------");
		
		Map<String,Shape> mt=new Hashtable<String,Shape>();
		i=0;
		for(Shape s:shapelist)
			mt.put(Integer.toString(i), s);
		for(String k:m.keySet())
			m.get(k).draw();
		
		
		print("------------------------------");
		
		
		
		
		
		//Arraylist
		ArrayList<Shape> al1 = new ArrayList<Shape>();
		ArrayList<Shape> al2 =new ArrayList<Shape>( Arrays.asList(new Circle(),new Circle(),new Square(),new Triangle()));
		for(i=0;i<al2.size();i++){
			al2.get(i).draw();
			al1.add(al2.get(i));
			Collections.addAll(c1, al2.get(i));
		}
		Collections.addAll(c1,al1.toArray(sp));
		c1.addAll(al1);
		//spÖ»ÓÐtriangle
//		for(Shape s: sp){
//			s.draw();
//		}		
		for(Shape s : al1){
			s.draw();
		}
		print("-----------------------");
		
		
		
		//collection
		
		for(Shape s:c1)
		{
			s.draw();
		}
		print("cal:---------------------------");
		cal.add(new Square());
		for(Shape s:cal){
			s.draw();
		}
		
		
		
		print("-----------------------");
		List<Shape> l =al2;
		print(l);
		
		l.remove(1);
		print(l);
		
		/*
//		List<String> l = new List<String>();
		shapelist.set(1, new Triangle());
//		shapelist.remove(1);
//		shapelist.add(new Square());
		for(Shape s:shapelist)
			s.draw();
*/
		
	}

}
