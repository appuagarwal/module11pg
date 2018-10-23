package com.cg.ems.ui;
import java.util.ArrayList;
import java.util.Scanner;
import com.cg.ems.dto.MobilePurchaseDTO;
import com.cg.ems.exception.MobilePurchaseException;
import com.cg.ems.service.MobileServiceImpl;

public class MobilePurchaseClient 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("********Welcome to Mobile Purchase System*********");
		int choice=0;
		while(true)
		{
			System.out.println("What do u want to do?");
			System.out.println("\t 1:Insert \t 2:Show all Emp\n"+"\t 3:Delete EMP \t Search Emp \t\n"+"\t 5:Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:mobileinsert();
			break;
			case 2:display();
			break;
			case 3:delete();
			break;
			case 4:search();
			break;
			default:System.out.println("******Thank You******");System.exit(0);
			}
		}

	}	
	
	
	private static void mobileinsert() 
	{
		MobileServiceImpl mobservice = new MobileServiceImpl();
	  try 
		{
			System.out.println("Enter customer name ");
			String cname=sc.next();	
			if(mobservice.validateCustomerName(cname))
			{
				System.out.println("Enter customer mail id ");
				String cmail=sc.next();
				if(mobservice.validateCustomerMail(cmail))
				{
					System.out.println("Enter customer phone no");
					String cphone=sc.next();
					if(mobservice.validateCustomerPhoneNo(cphone))
					{
						System.out.println("Enter customer mobileid which is of 4 digits");
						int mobileid=sc.nextInt();
						if(mobservice.validateCustomerMobileId(mobileid))
						{
							MobilePurchaseDTO mpd=new MobilePurchaseDTO(mobileid,cname,cmail,cphone);
							mobservice.insert(mpd);
						}
						else
						{
							System.out.println("Enter details properly");
						}
					}
				}	   
			}
		} 
		catch (MobilePurchaseException e) 
		{
			e.printStackTrace();
		}		
	}
	
	private static void display() 
	{
		MobileServiceImpl mobservice = new MobileServiceImpl();
		ArrayList<MobilePurchaseDTO> mobileList;
		try {
			mobileList=mobservice.display();
			System.out.println("\t mobileid \tmobile name \t mobile price \t mobile quantity");
			for(MobilePurchaseDTO mb:mobileList)
			{
				System.out.println("\t"+mb.getMobileId()+"\t"+mb.getMobileName()+"\t"+mb.getMobilePrice()+"\t"+mb.getMobileQuantity());
			}
		}
		catch (MobilePurchaseException e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void delete()
	{
		MobileServiceImpl mobservice = new MobileServiceImpl();
		try 
		{
			System.out.println("enter mobile id you want to delete");
			int mbid=sc.nextInt();
			MobilePurchaseDTO mpd=new MobilePurchaseDTO(mbid,null,null,null);
			mobservice.delete(mpd);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void search() 
	{
		Scanner sc=new Scanner(System.in);
		MobileServiceImpl mobservice = new MobileServiceImpl();
		MobilePurchaseDTO mpd=new MobilePurchaseDTO();
		System.out.println("Enter lowest range ");
		int minval=sc.nextInt();
		System.out.println("Enter highest range ");
		int maxval=sc.nextInt();
		try 
		{
			mobservice.search(minval,maxval);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
