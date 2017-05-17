package org.dimigo.abstractclass;

public class SmartPhoneTest {
	
    public static void main(String[] args) {
    	
        SmartPhone[] phones= {
        		new IPhone("iPhone 7","애플",900000), 
        		new Galaxy("갤럭시 S8", "삼성", 800000)
        		};
        
        for(SmartPhone val : phones){
            
        	System.out.println(val);
            val.turnOn();
            val.pay();
            val.useSpecialFunction();
            val.turnOff();
        }
    }
}
