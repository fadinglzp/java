package enumerated;

import static enumerated.Food.*;
import static lzp.tools.*;
import lzp.*;

enum Course {
	APPETIZER(Food.Appetizer.class), MAINCOURSE(Food.MainCourse.class), DESSERT(Food.Dessert.class), COFFEE(
			Food.Coffee.class);
	private Food[] values;

	private Course(Class<? extends Food> kind) {
		values = kind.getEnumConstants();
	}

	public Food randomSelect() {
		return Enums.random(values);
	}
}

public class TypeOfFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Food food = Appetizer.SALAD;
//		print(food.getClass().getEnumConstants());
//		food = MainCourse.LASAGNE;
//		print(food.getClass().getEnumConstants());
//		food = Coffee.BLACK_COFFEE;
//		print(food.getClass().getEnumConstants());
		
		
		for(int i=0;i<5;i++){
			for(Course course:Course.values()){
				Food food=course.randomSelect();
				print(food);
			}
			print("-------");
		}

	}

}
