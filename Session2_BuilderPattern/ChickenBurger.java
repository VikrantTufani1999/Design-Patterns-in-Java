package Session2_BuilderPattern;

public class ChickenBurger extends Burger{
	
	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price()
	{
		return 45.0f;
	}
}
