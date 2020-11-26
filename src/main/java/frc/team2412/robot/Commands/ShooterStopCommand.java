package frc.team2412.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.Subsystems.ShooterSubsystem;

public class ShooterStopCommand extends CommandBase {

	private ShooterSubsystem shooterSubsystem;

	public ShooterStopCommand(ShooterSubsystem shooterSubsystem) {
		this.shooterSubsystem = shooterSubsystem;
	}

	@Override
	public void execute() {
		shooterSubsystem.bothMotorsStop();
	}

	@Override
	public boolean isFinished() {
		return true;
	}

}
