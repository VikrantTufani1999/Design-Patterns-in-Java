package Session3_MediatorDesignPattern;

public interface IChatMediator {
	void addUser(IUser user);
	void sendMessage(String message, IUser sender);
}