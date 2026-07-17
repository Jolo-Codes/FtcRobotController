package org.firstinspires.ftc.teamcode;

public class Chapter5RobotLocation {
    double angle;
    double x;
    public Chapter5RobotLocation(double angle, double x) {
        this.angle = angle;
        this.x = x;
    }
    public double getHeading() {
        double angle = this.angle;
        while (angle > 180) {
            angle -= 360;
        }
        while (angle < -180) {
            angle += 360;
        }
        return angle;
    }

    @Override
    public String toString() {
         return "RobotLocation: angle (" + angle + ")";
    }
    public void turn(double angleChange) {
         angle+=angleChange;
    }
    public void setAngle(double angle) {
         this.angle=angle;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getAngle() {
        return this.angle;
    }
    public double getX() {
        return this.x;
    }
    public void changeX(double xChange) {
        x+=xChange;
    }
 }