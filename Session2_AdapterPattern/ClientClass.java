package Session2_AdapterPattern;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movable bugattiVeyron = new BugattiVeyron();
		
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImplement(bugattiVeyron);
		System.out.println(bugattiVeyronAdapter);

	}

}
