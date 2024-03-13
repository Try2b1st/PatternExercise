package org.example.facade;

public class MasterSwitch{
    private AirConditioner airConditioner;
    private DeskLamp deskLamp;
    private Television television;

    public MasterSwitch(AirConditioner airConditioner, DeskLamp deskLamp, Television television) {
        this.airConditioner = airConditioner;
        this.deskLamp = deskLamp;
        this.television = television;
    }


    public void turnOff(String x) {
        switch (x) {
            case ("1"): {
                airConditioner.off();
                break;
            }
            case ("2"): {
                deskLamp.off();
                break;
            }
            case ("3"): {
                television.off();
                break;
            }
            case ("4"): {
                airConditioner.off();
                deskLamp.off();
                television.off();
                System.out.println("All devices are off.");
                break;
            }
            default: {
                System.out.println("Invalid device code.");
                break;
            }
        }
    }
}
