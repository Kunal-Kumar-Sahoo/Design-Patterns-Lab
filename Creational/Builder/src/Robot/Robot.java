package Robot;

public class Robot {
    private String microcontroller, sensors, actuators;

    public Robot(String microcontroller, String sensors, String actuators) {
        this.microcontroller = microcontroller;
        this.sensors = sensors;
        this.actuators = actuators;
    }

    @Override
    public String toString() {
        return "Robot: \n\tMicrocontroller: " + this.microcontroller + "\n\tSensors: " + this.sensors +
                "\n\tActuators: " + this.actuators;
    }
}
