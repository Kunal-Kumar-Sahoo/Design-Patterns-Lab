package Robot;

public class RobotWorkshop {
    private String microcontroller, sensors, actuators;

    public RobotWorkshop setMicrocontroller(String microcontroller) {
        this.microcontroller = microcontroller;
        return this;
    }

    public RobotWorkshop setSensors(String sensors) {
        this.sensors = sensors;
        return this;
    }

    public RobotWorkshop setActuators(String actuators) {
        this.actuators = actuators;
        return this;
    }

    public Robot getRobot() {
        return new Robot(this.microcontroller, this.sensors, this.actuators);
    }
}
