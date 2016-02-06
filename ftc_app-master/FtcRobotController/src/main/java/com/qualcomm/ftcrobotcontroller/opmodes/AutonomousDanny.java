/* Copyright (c) 2014, 2015 Qualcomm Technologies Inc
All rights reserved.
Redistribution and use in source and binary forms, with or without modification,
are permitted (subject to the limitations in the disclaimer below) provided that
the following conditions are met:
Redistributions of source code must retain the above copyright notice, this list
of conditions and the following disclaimer.
Redistributions in binary form must reproduce the above copyright notice, this
list of conditions and the following disclaimer in the documentation and/or
other materials provided with the distribution.
Neither the name of Qualcomm Technologies Inc nor the names of its contributors
may be used to endorse or promote products derived from this software without
specific prior written permission.
NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. */

package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


/**
 * TeleOp Mode
 * <p>
 *Enables control of the robot via the gamepad
 */
public class AutonomousDanny extends LinearOpMode {

    DcMotor motorRight;
    DcMotor motorLeft;
    DcMotor motorTurbo;
    DcMotor middleRelease;
    DcMotor tapeMotor;
    Servo leftServo;
    Servo tapeServo;

    /*
       * Code to run when the op mode is first enabled goes here
       * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#start()
       */
    @Override
    public void runOpMode() {

        motorRight = hardwareMap.dcMotor.get("mRight");
        motorLeft = hardwareMap.dcMotor.get("mLeft");
        motorLeft.setDirection(DcMotor.Direction.REVERSE);

        // Turbo motor -- the one in the middle
        motorTurbo = hardwareMap.dcMotor.get("mMid");

        // Lifts and lowers the middle turbo motor
        middleRelease = hardwareMap.dcMotor.get("mRelease");

        // For big pull ups -- measureable muscle
        tapeMotor = hardwareMap.dcMotor.get("tapeRelease");
        tapeMotor.setDirection(DcMotor.Direction.REVERSE);

        // Lifts/lowers metal bar
        leftServo = hardwareMap.servo.get("lservo");

        // Lifts/lowers tape
        tapeServo = hardwareMap.servo.get("tapeServo");
        leftServo.setPosition(0.8);




// catches up to the spot in front of the button
        motorRight.setPower(0.9);
        motorLeft.setPower(1.0);
        double firstTime = System.currentTimeMillis();
        while(true){
            if(firstTime + 3000 <= System.currentTimeMillis()){
                motorRight.setPower(0.0);
                motorLeft.setPower(0.0);
                break;
            }
        }
////turns to be parallel with the wall
//        motorRight.setPower(1.0);
//        motorLeft.setPower(-1.0);
//        double secondTime = System.currentTimeMillis();
//        while(true){
//            if(secondTime + 300 == System.currentTimeMillis()){
//                motorRight.setPower(0.0);
//                motorLeft.setPower(0.0);
//                break;
//            }
//        }
//
//        //        do the light stuff
//        //         hit the button
//        //release the man
//
//
//
////turns to be parallel with ramp
//        motorRight.setPower(-1.0);
//        motorLeft.setPower(1.0);
//        double thirdTime = System.currentTimeMillis();
//        while(true){
//            if(thirdTime + 1200 == System.currentTimeMillis()){
//                motorRight.setPower(0.0);
//                motorLeft.setPower(0.0);
//                break;
//            }
//        }
//
//
////moves out to red side of ramp
//        motorRight.setPower(1.0);
//        motorLeft.setPower(1.0);
//        double fourthTime = System.currentTimeMillis();
//        while(true){
//            if(fourthTime + 1200 == System.currentTimeMillis()){
//                motorRight.setPower(0.0);
//                motorLeft.setPower(0.0);
//                break;
//            }
//        }
//
//        //moves to be perpendicular with ramp
//        motorRight.setPower(-1.0);
//        motorLeft.setPower(1.0);
//        double fifthTime = System.currentTimeMillis();
//        while(true){
//            if(fifthTime + 1200 == System.currentTimeMillis()){
//                motorRight.setPower(0.0);
//                motorLeft.setPower(0.0);
//                break;
//            }
//        }
//
//        //moves out to bottom of ramp
//        motorRight.setPower(1.0);
//        motorLeft.setPower(1.0);
//        double sixthTime = System.currentTimeMillis();
//        while(true){
//            if(sixthTime + 1200 == System.currentTimeMillis()){
//                motorRight.setPower(0.0);
//                motorLeft.setPower(0.0);
//                break;
//            }
//        }
//
//        //move servo to correct angle for tape measure, move tape measure, grapple
//        tapeServo.setPosition(0.3);
//        tapeMotor.setPower(1.0);
//        double seventhTime = System.currentTimeMillis();
//        while(true) {
//            if (seventhTime + 1800 == System.currentTimeMillis()) {
//                tapeMotor.setPower(0.0);
//                break;
//            }
//        }
//        tapeServo.setPosition(0.8);
//        tapeMotor.setPower(-1.0);
//        double eigthTime = System.currentTimeMillis();
//        while(true) {
//            if (eigthTime + 3000 == System.currentTimeMillis()) {
//                tapeMotor.setPower(0.0);
//                break;
//            }
        }
    }
