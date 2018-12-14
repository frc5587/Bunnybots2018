package org.frc5587.bunnybots.commands;

import org.frc5587.bunnybots.OI;
import org.frc5587.bunnybots.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ControlDoor extends Command {

    public ControlDoor() {
        requires(Robot.door);
    }

    @Override
    protected void initialize() {
        Robot.door.doorClose();
    }

    @Override
    protected void execute() {
        if (OI.controller.getAButton()) {
            System.out.println("Opening...");
            Robot.door.doorOpen();
        } else {
            System.out.println("Closing...");
            Robot.door.doorClose();
        }
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}