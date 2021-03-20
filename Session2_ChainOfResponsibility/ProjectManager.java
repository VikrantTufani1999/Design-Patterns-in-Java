package Session2_ChainOfResponsibility;

public class ProjectManager implements ILeaveRequestHandler{
	
	private ILeaveRequestHandler nextHandler;
	
	@Override
	public void HandleRequest(LeaveRequest lr)
	{
		int no_of_days = lr.getNoOfDaysLeave();
		if(no_of_days>3 && no_of_days<=5){
			System.out.println("Approved by Project Manager");
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
