package com.observer;


public aspect Performance {
	pointcut successT() : call(void com.observer.Ventana.*Listener(..));
    after() : successT() {   	
    	System.out.println("color xxxxx");  	
}}
