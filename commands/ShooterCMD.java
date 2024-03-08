package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSub;

public class ShooterCMD extends Command  {
    private final ShooterSub shooterSub;
    private final boolean shooterBool;

    public ShooterCMD(ShooterSub shooterSub,boolean shooterBool){
        this.shooterSub = shooterSub;
        this.shooterBool = shooterBool;


    }
    
    @Override
    public void initialize(){
        System.out.println("shootercmd started!");
    }

    @Override
    public void execute() {
        shooterSub.setShooterSpeed(shooterBool);
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("Shootercmd ended!");
        shooterSub.setShooterSpeed(false); //defaults end to set motors to 0
    }
}
