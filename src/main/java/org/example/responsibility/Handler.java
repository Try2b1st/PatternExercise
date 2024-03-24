package org.example.responsibility;

public interface Handler {

    void setNextHandler(Handler handler);

    void handlerRequest(LeaveRequest leaveRequest);
}
