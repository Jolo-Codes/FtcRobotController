package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {
    private DigitalChannel touchSensor;


    public void init(HardwareMap hwMap) { //How our robot knows what hardware to grn
        touchSensor = hwMap.get(DigitalChannel.class,"touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
    }

    public String getTouchSensorState() {
        if (!touchSensor.getState()) {
            return "Pressed";
        }
        else {
            return "Not Pressed!";
        }
    }
}
