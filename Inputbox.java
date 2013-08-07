package com.batch;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JDialog;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.text.SimpleDateFormat;
import java.util.Calendar;


 public class Inputbox 
	 {
    public static void main(String[]args)
    {
    	//sets the default text color
    	String currentColor="black";
    	//sets the string for output.
    	Object outputText=("I don't know what to say.");
    	//Opens up the input window.
        String input=JOptionPane.showInputDialog("Command Interface","NO CAPS");
        //Runs the input through tests.
        if(input.contains("help")) {
        	String outputText17=("Current available commands:Date,Time,and help.");
        	JOptionPane.showMessageDialog(null, "Current available commands:date,time,color,and help.");}
        else if(input.contains("time")) {
        
        	//TIME SETUP//
        	//Determines the time.
            	Calendar cal = Calendar.getInstance();
            	cal.getTime();
            	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            	//Sets the string for the time.
            	String currentTime = sdf.format(cal.getTime()) ;
            	//sends out the time.
            	JOptionPane.showMessageDialog(null, "Current time: "+currentTime);
        			String output=(currentTime);}
        	//END TIME SETUP//
        
        else if(input.contains("date")) {
        	
        	//DATE SETUP//
        	//Determines the date.
        	  Calendar calendar = Calendar.getInstance();
              SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
       String currentDate = dateFormat.format(calendar.getTime());
              try {
                  //Sends out the current date.
            	  JOptionPane.showMessageDialog(null, "Current date: "+currentDate);
                  String output=(currentDate);
              } catch (Exception e) {
                  e.printStackTrace();}}
        	//END DATE SETUP//
        else if(input.contains("color")) {
        	String output=("Current color: "+currentColor);
        	  JOptionPane.showMessageDialog(null, "Current text color: "+currentColor);}
        else if(input.contains("terminal")) {
            //Creates the output window
        	JFrame window = new JFrame();
        	window.setVisible(true);
        	window.setSize(500,600);
        	window.setTitle("Terminal-Note, Still in beta.");
        	JLabel label = new JLabel();
        	label.setText(""+output);
        	window.add(label);
        }else{
        		System.out.println("I don't know what to say to that");}
        System.out.println(""+outputText);

	 }}

 

        
 
        
 
