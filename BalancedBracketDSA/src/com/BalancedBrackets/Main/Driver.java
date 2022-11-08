
package com.BalancedBrackets.Main;

import com.BalancedBrackets.Model.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	CheckBalanceBarckets balanceBarcket = new CheckBalanceBarckets();
	String bracketExpression = "([[{}]])";
	
	if(balanceBarcket.checkBalance(bracketExpression)){ 
	   System.out.println("The entered String has Balanced Brackets ");	
	} 
	else {
		System.out.println("The entered Strings do not contain Balanced Brackets");	
} 
	}

}