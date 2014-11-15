/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

/**
 * Storage of all physical variables that connects to HWP.java
 * @author Sarang
 */
public class HWR {
    
    //Motors
    //Reset the PWM Values to whatever you need
   public static final int LEFT_MOTOR               = HWP.PWM_1;
   public static final int RIGHT_MOTOR              = HWP.PWM_2;
   public static final int SHOOTER_MOTOR   			= HWP.PWM_3;
    
    //Joystick
    public static final int LEFT_JOYSTICK               = HWP.JOY_1;
    public static final int RIGHT_JOYSTICK              = HWP.JOY_2;
    public static final int AUX_JOYSTICK                = HWP.JOY_3;
    

    
    //Buttons
    public static final int ACCEL_SHOOTER                = HWP.BUTTON_2;
    public static final int FIRE_SHOOTER				 = HWP.BUTTON_3;
    public static final int SPIT_SHOOTER 				 = HWP.BUTTON_4;
    public static final int RETRACT_CLIMBER				 = HWP.BUTTON_10;
    public static final int EXPAND_CLIMBER				 = HWP.BUTTON_11;
  
    
    //Solenoid module 1 (12v)
    public static final int SOLENOID_SLOT_12_VOLT           = HWP.SOLENOID_MODULE_2;
    public static final int SOLENOID_INDEX                  = 31;
    public static final int FIRE_PISTON                     = HWP.SOLENOID_1;
    public static final int SPIT_PISTON  					= HWP.SOLENOID_2;
    public static final int CLIMBER_PISTONS					= HWP.SOLENOID_3;
    
    /*//Solenoid module 2 (24v)
    public static final int SOLENOID_SLOT_24_VOLT           = HWP.SOLENOID_MODULE_1; 
    public static final int SOLENOID_24_INDEX               = 3;
    public static final int BACK_PICKER_UPPER_PISTON        = HWP.SOLENOID_4;
    public static final int FRONT_PICKER_UPPER_PISTON       = HWP.SOLENOID_5;*/
    
    
    //Compressors
    public static final int  COMPRESSOR_PRESSURE_SWITCH = HWP.GPIO_1;
    public static final int  COMPRESSOR_RELAY           = HWP.RELAY_8;
    
    //Sensors
    public static final int  BATTERY_VOLTAGE            = HWP.ANALOG_1;
    public static final int  GYRO                       = HWP.ANALOG_2;
    public static final int  LOW_PRESSURE_SENSOR        = HWP.ANALOG_3;
    public static final int  HIGH_PRESSURE_SENSOR       = HWP.ANALOG_4;
    public static final int  ANALOG_CHANNEL_5           = HWP.ANALOG_5;
    public static final int  LEFT_CHANNEL_A             = HWP.GPIO_2;//encoder
    public static final int  LEFT_CHANNEL_B             = HWP.GPIO_3;//encoder
    public static final int  RIGHT_CHANNEL_A            = HWP.GPIO_4;//encoder
    public static final int  RIGHT_CHANNEL_B            = HWP.GPIO_5;//encoder
    public static final int  MAGNETIC_PISTON_SENSOR     = HWP.GPIO_6;
    public static final int  LATCH_SWITCH               = HWP.GPIO_7; 
    public static final int  RETRACT_SENSOR             = HWP.GPIO_8;
    //Servos
    
    //Photogate
    
    //Utility
    public static int[] bitmaskArray                     = {HWP.FLAG_1,HWP.FLAG_2,HWP.FLAG_3, HWP.FLAG_4, 
                                                            HWP.FLAG_5, HWP.FLAG_6, HWP.FLAG_7, 
                                                            HWP.FLAG_8};
}