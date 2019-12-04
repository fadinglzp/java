package enumerated;
import java.util.*;
import lzp.*;
import static enumerated.Input.*;
import static lzp.tools.*;

enum Category{
	MONEY(NICKEL,DIME,QUARTER,DOLLAR),
	ITEM_SELECTION(TOOTHPASTE,CHIPS,SODA,SOAP),
	QUIT_TRANSACTION(ABORT_TRANSACTION),
	SHUT_DOWN(STOP);
	private Input[] values;
	Category(Input... types){values =types;}
	private static EnumMap<Input,Category> categories=new EnumMap<Input,Category>(Input.class);
	static {
		for(Category c: Category.class.getEnumConstants())
			for(Input type :c.values)
				categories.put(type, c);
	}
	public static Category categorize(Input input) {
		return categories.get(input);
	}
}

public class VendingMachine {
	
	enum StateDuration{TRANSIENT}
	enum State{
		RESTING{
			void next(Input input) {
				switch(Category.categorize(input)) {
				case MONEY:
					
				}
			}
		}
	}
	
	//private static State state= State
		
}
