package Session3_ObserverPattern;

public class SubscriberOne implements Observer {

	Publisher publisher;
	
	public SubscriberOne(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Subscriber one :: " + publisher.getState());
	}

}
