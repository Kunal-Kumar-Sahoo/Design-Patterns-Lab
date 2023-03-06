package Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new RobotWorkshop().setMicrocontroller("Arduino UNO").setSensors("HC-SR04").
                setActuators("BLDC Motors").getRobot();
        System.out.println(robot);
    }
}
