package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Disabled
public class Chapter5 extends OpMode {
    Chapter5RobotLocation robotLocation = new Chapter5RobotLocation(0,0);

    public void init() {
        robotLocation.setAngle(0);
        robotLocation.setX(0);
        //Always set to default here even if I set it to something in its constructor.
    }
    public void loop() {
        if (gamepad1.dpad_right) {
            robotLocation.changeX(0.1);
        }
        else if (gamepad1.dpad_left) {
            robotLocation.changeX(-0.1);
        }
        if (gamepad1.a) {
            robotLocation.turn(0.1);
        }
        else if (gamepad1.b) {
            robotLocation.turn(-0.1);
        }
        telemetry.addData("Location",robotLocation); //Uses the tostinr
        telemetry.addData("Heading",robotLocation.getHeading());
        telemetry.addData("Angle",robotLocation.getAngle());
        telemetry.addData("X",robotLocation.getX());
    }

}
