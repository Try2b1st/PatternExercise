package org.example.responsibility;

public class Director implements Handler {
    private static final int MAX_DAYS_SUPERVISOR_CAN_APPROVE = 10;

    public Director() {
    }

    @Override
    public void setNextHandler(Handler handler) {
        System.out.println("最高管理层");
    }

    @Override
    public void handlerRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() > MAX_DAYS_SUPERVISOR_CAN_APPROVE) {
            System.out.println(leaveRequest.getName() + "不给放假" + " by Director");
        }else{
            System.out.println(leaveRequest.getName() + "放假" + leaveRequest.getDays() + "天，by Director");
        }
    }
}
