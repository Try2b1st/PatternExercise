package org.example.responsibility;

public class Supervisor implements Handler{
    private static final int MAX_DAYS_SUPERVISOR_CAN_APPROVE = 3;
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handlerRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getDays() <= 0){
            System.out.println("开除" + leaveRequest.getName());
            return;
        }
        if(leaveRequest.getDays() < MAX_DAYS_SUPERVISOR_CAN_APPROVE){
            System.out.println(leaveRequest.getName() + "放假" + leaveRequest.getDays() + "天，by Supervisor");
        }else{
            nextHandler.handlerRequest(leaveRequest);
        }
    }
}
