package com.cg.ems.exception;
public class MobilePurchaseException extends Exception
{
	String msg;
	public MobilePurchaseException(String msg)
	{
		super(msg);
	}
}
