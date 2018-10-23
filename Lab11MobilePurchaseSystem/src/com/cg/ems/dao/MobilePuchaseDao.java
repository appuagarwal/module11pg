package com.cg.ems.dao;
import java.util.ArrayList;
import com.cg.ems.dto.MobilePurchaseDTO;
import com.cg.ems.exception.MobilePurchaseException;

public interface MobilePuchaseDao
{
	public void insert(MobilePurchaseDTO mp) throws MobilePurchaseException;
	public ArrayList<MobilePurchaseDTO> display() throws MobilePurchaseException;
	public void delete(MobilePurchaseDTO mp) throws MobilePurchaseException;
	public void search(int minval,int maxval) throws MobilePurchaseException;
}
