package komenda.workshop.command;

import komenda.workshop.Robot;

public class RobotDrillCommand implements Command{

    private Robot robot = new Robot();

    public RobotDrillCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.drill();
    }

    @Override
    public void undo() {

    }
}
