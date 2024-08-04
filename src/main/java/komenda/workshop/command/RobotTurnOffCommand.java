package komenda.workshop.command;

import komenda.workshop.Robot;

public class RobotTurnOffCommand implements Command {

    private Robot robot = new Robot();

    public RobotTurnOffCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOff();
    }

    @Override
    public void undo() {
        robot.turnOn();
    }

}
