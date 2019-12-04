package enumerated;

import static lzp.tools.*;
import java.util.*;
import static enumerated.AlarmPoints.*;

public class EnumSets {
	enum Big{ A0,A1,A2,A3,A4,A5,A6,A7,A8,A9	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
		print(points);
		points.add(BATHROOM);
		print(points);
		points.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
		print(points);
		points=EnumSet.allOf(AlarmPoints.class);
		points.removeAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
		print(points);	
		points.removeAll(EnumSet.range(OFFICE1, OFFICE4));
		print(points);
		points=EnumSet.complementOf(points);
		print(points);
		
		EnumSet<Big> bigEnumSet=EnumSet.allOf(Big.class);
		print(bigEnumSet);
		int i=-11;
		print(i>>1);
	}

}
