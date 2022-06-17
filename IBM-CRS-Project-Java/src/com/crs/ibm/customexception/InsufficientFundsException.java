/**
 * 
 */
package com.crs.ibm.customexception;

/**
 * @author 003NZ1744
 *
 */
public class InsufficientFundsException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private double amount;
	   public InsufficientFundsException(double amount)
	   {
	      this.amount = amount;
	   } 
	   public double getAmount()
	   {
	      return amount;
	   }

}
