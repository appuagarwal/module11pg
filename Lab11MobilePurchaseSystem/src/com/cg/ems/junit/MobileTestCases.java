package com.cg.ems.junit;
import org.junit.Test;
import com.cg.ems.dto.MobilePurchaseDTO;
import com.cg.ems.exception.MobilePurchaseException;
import com.cg.ems.service.MobileServiceImpl;
public class MobileTestCases
{
	@Test(expected=com.cg.ems.exception.MobilePurchaseException.class)
	public void testfn1()throws MobilePurchaseException
	{
		MobilePurchaseDTO obj=new MobilePurchaseDTO(1009,"Apurva","appu@gmail.com","9923416632");
		MobileServiceImpl purchaseService=new MobileServiceImpl();
		purchaseService.insert(obj);
				
	}
	
}
