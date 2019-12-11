package xml;
import nu.xom.*;

import java.io.File;
import java.util.*;

public class People extends ArrayList<Person> {
	public People(String fileName) throws Exception{
		Builder b=new Builder();
		Document doc=b.build(new File(fileName));
		Elements elements=doc.getRootElement().getChildElements();
		for(Element e:elements)
			add(new Person(e));
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		People p=new People("People.xml");
		System.out.println(p);
		
	}

}
