package frc.team2412.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.Subsystems.LiftSubsystem;

public class LiftUpDownCommand extends CommandBase {

	private LiftSubsystem liftsubsystem;

	public LiftUpDownCommand(LiftSubsystem liftSubsystem) {
		this.liftsubsystem = liftSubsystem;
	}
	
	public void execute() {
		liftsubsystem.extend();
		liftsubsystem.retract();
	}
	
	public boolean isFinished() {
		return true;
	}

	
}
