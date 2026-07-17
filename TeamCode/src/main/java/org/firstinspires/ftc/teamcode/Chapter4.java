package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
public class Chapter4 extends OpMode {
    double speedlx = 0;
    double speedry = 0;
    double speedrx = 0;
    double speedly = 0;

    @Override
    public void init() {
        telemetry.addLine("Code Starting");
    }
    @Override
    public void loop() {
        if (gamepad1.a) {
            telemetry.addLine("Turbo Mode Activated!");
            speedlx = gamepad1.left_stick_x;
            speedry = gamepad1.right_stick_y;
            speedrx = gamepad1.right_stick_x;
            speedly = gamepad1.left_stick_y;

        }
        else {
            speedlx = gamepad1.left_stick_x*0.5;
            speedry = gamepad1.right_stick_y*0.5;
            speedrx = gamepad1.right_stick_x*0.5;
            speedly = gamepad1.left_stick_y*0.5;

        }
        telemetry.addData("Leftx",speedlx);
        telemetry.addData("Righty",speedry);
        telemetry.addData("Rightx",speedrx);
        telemetry.addData("Lefty",speedly);
    }
}
