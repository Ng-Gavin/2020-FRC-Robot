/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;

public class ManualShoot extends CommandBase {
  /**
   * Creates a new Shoot.
   */
  private final Shooter m_Shooter;
  private double leftspeed;
  private double rightspeed;
  public ManualShoot(Shooter subsystem, double leftspeed, double rightspeed) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_Shooter = subsystem;
    addRequirements(m_Shooter);
    this.leftspeed = leftspeed;
    this.rightspeed = rightspeed;

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_Shooter.manualShot(leftspeed, rightspeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
