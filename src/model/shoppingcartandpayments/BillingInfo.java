package model.shoppingcartandpayments;

import java.io.Serializable;

public class BillingInfo implements Serializable {
	
	public String nameOnCard;

	public String creditCardNum;

	
	public BillingInfo(String name, String num) {
		this.nameOnCard = name;
		this.creditCardNum = num.replaceAll("\\D", "");
	}
	
	public boolean checkLuhn(String cardNo)
	{
	    int nDigits = cardNo.length();
	 
	    int nSum = 0;
	    boolean isSecond = false;
	    for (int i = nDigits - 1; i >= 0; i--) 
	    {
	 
	        int d = cardNo.charAt(i) - '0';
	 
	        if (isSecond == true)
	            d = d * 2;
	 
	        // We add two digits to handle
	        // cases that make two digits 
	        // after doubling
	        nSum += d / 10;
	        nSum += d % 10;
	 
	        isSecond = !isSecond;
	    }
	    return (nSum % 10 == 0);
	}
	 
	  
	
	
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getCreditCardNum() {
		return creditCardNum;
	}
	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}

	
	
	

}
