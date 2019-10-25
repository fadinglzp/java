package typeinfo;
import static lzp.tools.*;
import java.util.*;

public class Staff extends ArrayList<Position> {
	public void add(String title, Person person) {
		add(new Position(title, person));
	}

	public void add(String... titles) {
		for (String title : titles)
			add(new Position(title));
	}

	public Staff(String... titles) {
		add(titles);
	}

	public boolean positionAvailable(String title) {
		for (Position position : this)
			if (position.getTitle().equals(title) && position.getPerson() == Person.NULL)
				return true;
		return false;
	}

	public void fillPosition(String title, Person hire) {
		for (Position position : this)
			if (position.getTitle().equals(title) && position.getPerson() == Person.NULL) {
				position.setPerson(hire);
				return;
			}
		throw new RuntimeException("Position "+title+" not available");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff staff=new Staff("President","CTO","Marketing Manager","Product Manager");
		staff.fillPosition("President", new Person("Me","Last","The Top"));
		if(staff.positionAvailable("CTO"))
			staff.fillPosition("CTO",new Person("Bob","Coder","Bright"));
		for(Position p:staff){
			print(p);
		}
		
		
	}

}
