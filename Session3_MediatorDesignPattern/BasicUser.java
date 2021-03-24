package Session3_MediatorDesignPattern;

public class BasicUser implements IUser {
	
	private IChatMediator chatmediator;
	private String name;
	
	// Constructor
	public BasicUser(IChatMediator chatmediator, String name) {
		this.chatmediator = chatmediator;
		this.name = name;
	}
	
	@Override
	public void sendMessage(String message) {
		chatmediator.sendMessage(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(name + ": {Basic User} has received a message: " + message);
	}

}