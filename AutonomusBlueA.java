package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="AutonomusBlueA", group="Linear Opmode")

public class AutonomusBlueA extends LinearOpMode{

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor leftFrontDrive = null;
    private DcMotor leftBackDrive = null;
    private DcMotor rightFrontDrive = null;
    private DcMotor rightBackDrive = null;

    public void runOpMode() {

        // Initialize the hardware variables. Note that the strings used here as parameters
        // to 'get' must correspond to the names assigned during the robot configuration
        // step (using the FTC Robot Controller app on the phone).
        leftFrontDrive = hardwareMap.get(DcMotor.class, "leftFrontDrive");
        leftBackDrive = hardwareMap.get(DcMotor.class, "leftBackDrive");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "rightFrontDrive");
        rightBackDrive = hardwareMap.get(DcMotor.class, "rightBackDrive");

        // To drive forward, most robots need the motor on one side to be reversed, because the axles point in opposite directions.
        // Pushing the left stick forward MUST make robot go forward. So adjust these two lines based on your first test drive.
        // Note: The settings here assume direct drive on left and right wheels.  Gear Reduction or 90 Deg drives may require direction flips
        // leftDrive.setDirection(DcMotor.Direction.REVERSE);
        // rightDrive.setDirection(DcMotor.Direction.FORWARD);

        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        runtime.reset();

        // Setup a variable for each drive wheel to save power level for telemetry
        double leftPowerBack;
        double leftPowerFront;
        double rightPowerBack;
        double rightPowerFront;
        
        double DRIVESPEED=0.5;
        
        // run until the end of the match (driver presses STOP)
        
        // Send calculated power to wheels
        //Straight forward to spike
        runtime.reset();
        leftFrontDrive.setPower(-DRIVESPEED);
        leftBackDrive.setPower(DRIVESPEED);
        rightFrontDrive.setPower(DRIVESPEED);
        rightBackDrive.setPower(-DRIVESPEED);
        while (opModeIsActive() && (runtime.seconds() < 1.1)) {
        }
        
        // spin code left to face backdrop
        runtime.reset();
        leftFrontDrive.setPower(DRIVESPEED);
        leftBackDrive.setPower(DRIVESPEED);
        rightFrontDrive.setPower(DRIVESPEED);
        rightBackDrive.setPower(DRIVESPEED);
        while (opModeIsActive() && (runtime.seconds() < .8)) {
        }
        
        //Straight forward to backdrop
        runtime.reset();
        leftFrontDrive.setPower(-DRIVESPEED);
        leftBackDrive.setPower(DRIVESPEED);
        rightFrontDrive.setPower(DRIVESPEED);
        rightBackDrive.setPower(-DRIVESPEED);
        while (opModeIsActive() && (runtime.seconds() < 1.65)) {
        }
        
        //STOP to place pixel in backdrop
        leftFrontDrive.setPower(0);
        leftBackDrive.setPower(-0);
        rightFrontDrive.setPower(-0);
        rightBackDrive.setPower(0);
        while (opModeIsActive() && (runtime.seconds() < 3.0)) {
        } 
        //Straight backward code
        runtime.reset();
        leftFrontDrive.setPower(DRIVESPEED);
        leftBackDrive.setPower(-DRIVESPEED);
        rightFrontDrive.setPower(-DRIVESPEED);
        rightBackDrive.setPower(DRIVESPEED);
        while (opModeIsActive() && (runtime.seconds() < .1)) {
        }
        // strafe code left to park
        runtime.reset();
        leftFrontDrive.setPower(-DRIVESPEED);
        leftBackDrive.setPower(DRIVESPEED);
        rightFrontDrive.setPower(-DRIVESPEED);
        rightBackDrive.setPower(DRIVESPEED);
        while (opModeIsActive() && (runtime.seconds() < 1.2)) {
        } 
        // spin code right
        runtime.reset();
        leftFrontDrive.setPower(-DRIVESPEED);
        leftBackDrive.setPower(-DRIVESPEED);
        rightFrontDrive.setPower(-DRIVESPEED);
        rightBackDrive.setPower(-DRIVESPEED);
        while (opModeIsActive() && (runtime.seconds() < 1.2)) {
        }
        //STOP
        leftFrontDrive.setPower(0);
        leftBackDrive.setPower(-0);
        rightFrontDrive.setPower(-0);
        rightBackDrive.setPower(0);
    }

    // todo: write your code here
}
