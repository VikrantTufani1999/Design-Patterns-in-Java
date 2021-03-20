package Session2_ChainOfResponsibility;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployeeName("Vikrant");
		leaveRequest.setNoOfDaysLeave(8);
		ILeaveRequestHandler sv = new Supervisor();
		ILeaveRequestHandler pm = new ProjectManager();
		ILeaveRequestHandler hr = new HR();
		sv.nextHandler(pm);
		pm.nextHandler(hr);
		hr.nextHandler(null);
		sv.HandleRequest(leaveRequest);
	}

}
