// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.commands.Spin;
import frc.robot.commands.DriveForward;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.Drivetrain;

public final class Autos {
  /** Example static factory for an autonomous command. */
  public static CommandBase exampleAuto(ExampleSubsystem subsystem)
  {
    return Commands.sequence(subsystem.exampleMethodCommand(), new ExampleCommand(subsystem));
  }

  public static CommandBase driveForwardAuto(Drivetrain drivetrain)
  {
    DriveForward driveForward = new DriveForward(drivetrain, 0.65, 2);
    return Commands.sequence(driveForward);
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
