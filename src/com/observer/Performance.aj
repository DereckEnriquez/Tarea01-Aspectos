package com.observer;
import java.io.*;
import java.util.*;
import java.util.Calendar;



public aspect Performance {
	
	File file = new File("Regristro de cambio de color.txt");
	Calendar cal = Calendar.getInstance();
	
	pointcut successT1() : call(void com.observer.Ventana.ChangeColorBlue(..));
    after() : successT1() {
    	cal=Calendar.getInstance();
    	try {
            FileWriter escribir = new FileWriter(file, true);
            for (int i = 0; i < 2; i++) {
                escribir.write("\r\n"); 
            }
            escribir.write("Cambio a color Azul ");
            escribir.write(Integer.toString(cal.get(Calendar.HOUR_OF_DAY))+":"+Integer.toString(cal.get(Calendar.MINUTE)));
            escribir.close();
        } 
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
    	}
    
    pointcut successT2() : call(void com.observer.Ventana.ChangeColorCyan(..));
    after() : successT2() {
    	cal=Calendar.getInstance();
    	try {
            FileWriter escribir = new FileWriter(file, true);
            for (int i = 0; i < 2; i++) {
                escribir.write("\r\n"); 
            }
            escribir.write("Cambio a color Cyan ");
            escribir.write(Integer.toString(cal.get(Calendar.HOUR_OF_DAY))+":"+Integer.toString(cal.get(Calendar.MINUTE)));
            escribir.close();
        } 
        catch (Exception e) {
            System.out.println("Error al escribir");
        }  	
    }
    pointcut successT3() : call(void com.observer.Ventana.ChangeColorGreen(..));
    after() : successT3() {
    	cal=Calendar.getInstance();
    	try {
            FileWriter escribir = new FileWriter(file, true);
            for (int i = 0; i < 2; i++) {
                escribir.write("\r\n"); 
            }
            escribir.write("Cambio a color Verde ");
            escribir.write(Integer.toString(cal.get(Calendar.HOUR_OF_DAY))+":"+Integer.toString(cal.get(Calendar.MINUTE)));
            escribir.close();
        } 
        catch (Exception e) {
            System.out.println("Error al escribir");
        } 	
    }
}