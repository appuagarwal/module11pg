package com.cg.ems.dao;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.cg.ems.dto.MobilePurchaseDTO;
import com.cg.ems.exception.MobilePurchaseException;
import com.cg.ems.util.DBUtil;

public class MobilePurchaseDaoImpl implements MobilePuchaseDao
{
	Connection con=null;
	Statement st=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	public void insert(MobilePurchaseDTO mp) throws MobilePurchaseException
	{
		try
		{
			con=DBUtil.getConn();
			String selectqry="SELECT quantity from mobiles_31 where mobileid="+mp.getMobileId();
			st=con.createStatement();
			rs=st.executeQuery(selectqry);
			rs.next();
			if(Integer.parseInt(rs.getString("quantity"))>0)
			{
				System.out.println("Quantity="+Integer.parseInt(rs.getString("quantity")));
				String insertquery="insert into purchasedetails_31 values(mobileid_sequence.nextval,?,?,?,?,?)";
				pst=con.prepareStatement(insertquery);	
				pst.setString(1,mp.getCustomerName());
				pst.setString(2,mp.getCustomerEmailId());
				pst.setString(3,mp.getCustomerPhoneNo());	
				Timestamp date=new Timestamp(new java.util.Date().getTime());
				pst.setTimestamp(4,date);
				pst.setInt(5,mp.getMobileId());
				int noOfRecAffected=pst.executeUpdate();
				System.out.println(noOfRecAffected+" data is inserted in the table");
				
				int mobileid=mp.getMobileId();
				String updateqry="UPDATE mobiles_31 SET quantity=(quantity-1) where mobileid=?";
				PreparedStatement pstnew = con.prepareStatement(updateqry);
				pstnew.setInt(1,mobileid);
				pstnew.executeUpdate();
				System.out.println(" data is updated in the table");
			}
		 }
		catch(Exception e)
		{
			e.printStackTrace();
			throw new MobilePurchaseException(e.getMessage());
		}		
	}
	public ArrayList<MobilePurchaseDTO> display() throws MobilePurchaseException
	{
		ArrayList<MobilePurchaseDTO> mobileList=null;
		try {
			mobileList=new ArrayList<MobilePurchaseDTO>();
			con=DBUtil.getConn();
			String selectqry="SELECT * from mobiles_31 where mobileid>=0";
			st=con.createStatement();
			rs=st.executeQuery(selectqry);
			while(rs.next())
			{
				mobileList.add(new MobilePurchaseDTO(rs.getInt("mobileid"),rs.getString("name"),rs.getInt("price"),rs.getString("quantity")));
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		return mobileList;
	}
	public void delete(MobilePurchaseDTO mp) throws MobilePurchaseException
	{
		try {
			con=DBUtil.getConn();
			String delquery="DELETE from mobiles_31 where mobileid=?";
			pst=con.prepareStatement(delquery);	
			pst.setInt(1,mp.getMobileId());
			pst.executeUpdate();
			System.out.println(" data is deleted in the table");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public void search(int minval,int maxval) throws MobilePurchaseException
	{
		try 
		{
			con=DBUtil.getConn();
			String srchquery="SELECT name from mobiles_31 where price>=? and price<=?";
			pst=con.prepareStatement(srchquery);	
			pst.setInt(1,minval);
			pst.setInt(2,maxval);
			rs=pst.executeQuery();
			while(rs.next())
			{
				System.out.println("mobile avilable:"+rs.getString("name"));
			}
			
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
