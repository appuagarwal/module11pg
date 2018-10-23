package com.cg.ems.service;
import java.util.ArrayList;
import java.util.regex.Pattern;
import com.cg.ems.dao.MobilePurchaseDaoImpl;
import com.cg.ems.dto.MobilePurchaseDTO;
import com.cg.ems.exception.MobilePurchaseException;
public class MobileServiceImpl implements MobileService
{
	MobilePurchaseDaoImpl mobDao=new MobilePurchaseDaoImpl();
	public void insert(MobilePurchaseDTO mp) throws MobilePurchaseException
	{
		mobDao.insert(mp);
	}
	public ArrayList<MobilePurchaseDTO> display() throws MobilePurchaseException
	{
		return mobDao.display();
	}
	public void delete(MobilePurchaseDTO mp) throws MobilePurchaseException
	{
		mobDao.delete(mp);
	}
	public void search(int minval,int maxval) throws MobilePurchaseException
	{
		mobDao.search(minval,maxval);
	}
	public boolean validateCustomerName(String cName) throws MobilePurchaseException 
	{
			String namePattern="[A-Z][a-z]+";
			if(Pattern.matches(namePattern, cName) && (cName.length()<=20))
			{
				return true;
			}
			else
			{
				throw new MobilePurchaseException("Invalid Customer Name. Should start with capital"+"only characters allowed");
			}
	}
	
	public boolean validateCustomerMail(String cMail) throws MobilePurchaseException 
	{
		String emailPattern="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
		if(Pattern.matches(emailPattern, cMail))
		{
			return true;
		}
		else
		{
			throw new MobilePurchaseException("Invalid  Customer email id");
		}
	}
	
	public boolean validateCustomerPhoneNo(String cPhNo) throws MobilePurchaseException
	{
		String phonePattern="(0/91)?[7-9][0-9]{9}";
		if(Pattern.matches(phonePattern, cPhNo))
		{
			return true;
		}
		else
		{
			throw new MobilePurchaseException("Invalid Customer Phone No. Enter 10 digit number");
		}
	}
	
	public boolean validateCustomerMobileId(int mobileid)throws MobilePurchaseException
	{
		String mobid=Integer.toString(mobileid);
		String mobileidPattern="[1-9][0-9]{3}";
		if(Pattern.matches(mobileidPattern,mobid))
		{
			return true;
		}
		else
		{
			throw new MobilePurchaseException("Invalid mobileid");
		}
	}
}
