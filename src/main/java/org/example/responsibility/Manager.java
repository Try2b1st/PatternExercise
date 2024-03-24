package org.example.responsibility;

public class Manager implements Handler {

    private static final int MAX_DAYS_SUPERVISOR_CAN_APPROVE = 7;
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handlerRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() < MAX_DAYS_SUPERVISOR_CAN_APPROVE) {
            System.out.println(leaveRequest.getName() + "放假" + leaveRequest.getDays() + "天，by Manager");
        } else {
            nextHandler.handlerRequest(leaveRequest);
        }
    }
}
