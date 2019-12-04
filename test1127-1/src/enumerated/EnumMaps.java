package enumerated;

import java.util.*;
import static enumerated.AlarmPoints.*;
import static lzp.tools.*;

interface Command {
	void action();
}

public class EnumMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap<AlarmPoints, Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
		em.put(KITCHEN, new Command() {
			public void action() {
				print("Kitchen fire");
			}
		});
		em.put(BATHROOM, new Command() {
			public void action() {
				print("Bathroom alret");
			}
		});
		for(Map.Entry<AlarmPoints, Command> e :em.entrySet())
		{
			printl(e.getKey()+": ");
			e.getValue().action();
		}
		try {
			em.get(UTILITY).action();
		}catch(Exception e) {
			print(e);
		}
	}
}
