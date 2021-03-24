package Session3_ObserverPattern;

public class SubscriberThree implements Observer {

	Publisher publisher;
	
	public SubscriberThree(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Subscriber three :: " + publisher.getState());
	}

}