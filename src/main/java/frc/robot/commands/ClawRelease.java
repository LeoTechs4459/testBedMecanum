// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Claw;

import edu.wpi.first.wpilibj.Timer;

public class ClawRelease extends CommandBase {
	@SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
	private final Claw claw;

	private boolean timed;
	private final double time = 1;
	private Timer timer = new Timer();

	public ClawRelease(Claw c, boolean isTimed) {
		claw = c;
		timed = isTimed;

		// Use addRequirements() here to declare subsystem dependencies.
		addRequirements(c);
	}

	// Called when the command is initially scheduled.
	@Override
	public void initialize()
	{}

	// Called every time the scheduler runs while the command is scheduled.
	@Override
	public void execute()
	{
		claw.setGrip(-1);
	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted)
	{
		
	}

	// Returns true when the command should end.
	@Override
	public boolean isFinished()
	{
		if (timer.get() > time && timed)
		{
			return true;
		}

		return false;
	}
}
