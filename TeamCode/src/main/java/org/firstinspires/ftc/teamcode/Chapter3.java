package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;


@Disabled //Critical Line
public class Chapter3 extends OpMode {

    @Override
    public void init() {
        telemetry.addData("right stick y",gamepad1.right_stick_y);
        telemetry.addData("right stick x",gamepad1.right_stick_x);
        telemetry.addData("right stick button",gamepad1.right_stick_button);
        telemetry.addData("left vs right",gamepad1.left_stick_y - gamepad1.right_stick_y);
        telemetry.addData("sum",gamepad1.right_trigger + gamepad1.left_trigger);

        }
    @Override
    public void loop() {
    }
    /*

     */
}
