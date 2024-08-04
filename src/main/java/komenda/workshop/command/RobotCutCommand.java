package komenda.workshop.command;

import komenda.workshop.Robot;

public class RobotCutCommand implements Command{

    private Robot robot = new Robot();

    public RobotCutCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.cut();
    }

    @Override
    public void undo() {

    }
}
