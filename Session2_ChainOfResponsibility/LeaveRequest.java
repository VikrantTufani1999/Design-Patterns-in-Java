package Session2_ChainOfResponsibility;

public class LeaveRequest {
	
	private int noOfDaysLeave;
	private String employeeName;
	
	public String getEmployeeName()
	{
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public int getNoOfDaysLeave() {
		return noOfDaysLeave;
	}
	
	public void setNoOfDaysLeave(int noOfDaysLeave)
	{
		this.noOfDaysLeave = noOfDaysLeave;
	}
}
