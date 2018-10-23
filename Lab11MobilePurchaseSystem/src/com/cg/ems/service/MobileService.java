package com.cg.ems.service;
import java.util.ArrayList;
import com.cg.ems.dto.MobilePurchaseDTO;
import com.cg.ems.exception.MobilePurchaseException;

public interface MobileService
{
	public void insert(MobilePurchaseDTO mp) throws MobilePurchaseException;
	public ArrayList<MobilePurchaseDTO> display() throws MobilePurchaseException;
	public void delete(MobilePurchaseDTO mp) throws MobilePurchaseException;
	public void search(int minval,int maxval) throws MobilePurchaseException;
	public boolean validateCustomerName(String cName) throws MobilePurchaseException;
	public boolean validateCustomerMail(String cMail) throws MobilePurchaseException;
	public boolean validateCustomerPhoneNo(String cPhNo) throws MobilePurchaseException;
	public boolean validateCustomerMobileId(int mobileid)throws MobilePurchaseException;
}
