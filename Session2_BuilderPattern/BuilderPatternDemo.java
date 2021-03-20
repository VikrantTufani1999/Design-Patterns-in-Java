package Session2_BuilderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MealBuilder mealbuilder = new MealBuilder();
		
		// VegMeal Test
		Meal vegMeal = mealbuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total cost: " + vegMeal.getCost());
		System.out.println();
		
		// NonVegMeal Test
		Meal NonVegMeal = mealbuilder.prepareVegMeal();
		System.out.println("Non Veg Meal");
		NonVegMeal.showItems();
		System.out.println("Total cost: " + NonVegMeal.getCost());
		System.out.println();
	}

}
