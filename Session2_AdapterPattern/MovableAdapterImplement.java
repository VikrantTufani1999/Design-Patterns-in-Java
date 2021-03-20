package Session2_AdapterPattern;

public class MovableAdapterImplement implements MovableAdapter {
	private Movable luxuryCars;
	
	public MovableAdapterImplement(Movable luxuryCar) {
		this.luxuryCars = luxuryCar;
	}

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}
	
	@Override
	public double getPrice()
	{
		return USDtoEuro(luxuryCars.getPrice());
	}
	
	private double USDtoEuro(double usd)
	{
		return usd * 0.84;
	}

}
