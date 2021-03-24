package Session3_MediatorDesignPattern;

public class Main {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator();
		
		IUser basicUser = new BasicUser(chatMediator, "Vikrant");
		IUser premiumUser = new PremiumUser(chatMediator, "Asit");
		
		chatMediator.addUser(basicUser);
		chatMediator.addUser(premiumUser);
		chatMediator.addUser(new BasicUser(chatMediator, "Kapil"));
		chatMediator.addUser(new PremiumUser(chatMediator, "Harsh"));
		
		premiumUser.sendMessage("Hey there!");
	}

}