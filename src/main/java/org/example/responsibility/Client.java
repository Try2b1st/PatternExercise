package org.example.responsibility;

public class Client {
    public static void main(String[] args) {
        LeaveRequest a = new LeaveRequest("王高志", 12);
        LeaveRequest b = new LeaveRequest("wgz", 5);
        LeaveRequest c = new LeaveRequest("hyx", -1);

        Director director  =new Director();
        Manager manager = new Manager();
        Supervisor supervisor = new Supervisor();

        supervisor.setNextHandler(manager);
        manager.setNextHandler(director);

        supervisor.handlerRequest(a);
        supervisor.handlerRequest(b);
        supervisor.handlerRequest(c);
    }
}
