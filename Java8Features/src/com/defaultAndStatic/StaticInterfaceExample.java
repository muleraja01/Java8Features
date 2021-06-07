package com.defaultAndStatic;
interface staticInterf{
	public static void ccpayment(){
		System.out.println("payment for any bank");
	}
}
public class StaticInterfaceExample implements staticInterf{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInterfaceExample s=new StaticInterfaceExample();
		//s.cccpayment(); XXXXXXXXXXXXXXX
		//ccpayment(); XXXXXXXXXXXXXXXXXX
		staticInterf.ccpayment();
	}
}


