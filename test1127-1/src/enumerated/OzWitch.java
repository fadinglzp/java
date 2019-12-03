package enumerated;

import static lzp.tools.*;

public enum OzWitch {
	WEST("1"), NORTH("2"), EAST("3"), SOUTH("4");
	private String description;
	private OzWitch(String description){
		this.description=description;
	}
	public String getDescription(){
		return description;
	}
	public String toString(){
		String id=name();
		String lower = id.substring(1).toLowerCase();
		return id.charAt(0)+lower;
	}
	public static void main(String[] args){
		for(OzWitch witch:OzWitch.values())
			print(witch+" : "+witch.getDescription());
	}

}
