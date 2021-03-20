package Session2_ChainOfResponsibility;

public class HR implements ILeaveRequestHandler{
	
	private ILeaveRequestHandler nextHandler;
	LeaveRequest lr;
	
	@Override
	public void HandleRequest(LeaveRequest lr)
	{
		int no_of_days = lr.getNoOfDaysLeave();
		if(no_of_days>5)
		{
			System.out.println("Approved by HR");
		}
		else
		{
			System.out.println("Rejected");
		}
	}
	
	@Override
	public void nextHandler(ILeaveRequestHandler next)
	{
		this.nextHandler = next;
	}

}
