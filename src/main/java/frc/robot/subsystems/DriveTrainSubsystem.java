package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrainSubsystem extends SubsystemBase {


    private final static DriveTrainSubsystem INSTANCE = new DriveTrainSubsystem();


    /**
     * Returns the Singleton instance of this DriveTrainSubsystem. This static method
     * should be used, rather than the constructor, to get the single instance
     * of this class. For example: {@code DriveTrainSubsystem.getInstance();}
     */

    @SuppressWarnings("WeakerAccess")
    public static DriveTrainSubsystem getInstance() {
        return INSTANCE;
    }

    /**
     * Creates a new instance of this DriveTrainSubsystem. This constructor
     * is private since this class is a Singleton. Code should use
     * the {@link #getInstance()} method to get the singleton instance.
     */
    private DriveTrainSubsystem() {
        // TODO: Set the default command, if any, for this subsystem by calling setDefaultCommand(command)
        //       in the constructor or in the robot coordination class, such as RobotContainer.
        //       Also, you can call addChild(name, sendableChild) to associate sendables with the subsystem
        //       such as SpeedControllers, Encoders, DigitalInputs, etc.
    }
}

