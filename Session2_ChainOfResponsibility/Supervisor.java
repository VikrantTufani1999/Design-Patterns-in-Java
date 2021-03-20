package Session2_ChainOfResponsibility;

public class Supervisor implements ILeaveRequestHandler{
	
	private ILeaveRequestHandler nextHandler;
	
	@Override
	public void HandleRequest(LeaveRequest lr)
	{
		int no_of_days = lr.getNoOfDaysLeave();
		if(no_of_days>=1 && no_of_days<3)
		{
			System.out.println("Approved by Supervisor");
		}
		else {
			nextHandler.HandleRequest(lr);
		}
	}
	@Override
	public void nextHandler(ILeaveRequestHandler next)
	{
		this.nextHandler = next;
	}
}
