package Session2_ChainOfResponsibility;

public interface ILeaveRequestHandler {

		void nextHandler(ILeaveRequestHandler next);
		void HandleRequest(LeaveRequest lr);
}
