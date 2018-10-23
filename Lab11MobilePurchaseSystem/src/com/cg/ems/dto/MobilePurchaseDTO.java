package com.cg.ems.dto;

public class MobilePurchaseDTO
{
	private int mobileId;
	private String mobileName;
	private int mobilePrice;
	private String mobileQuantity;
	private int customerPurchaseId;
	private String customerName;
	private String customerEmailId;
	private String customerPhoneNo;
	private String customerPurchaseDate;

	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public String getMobileQuantity() {
		return mobileQuantity;
	}
	public void setMobileQuantity(String mobileQuantity) {
		this.mobileQuantity = mobileQuantity;
	}
	public int getCustomerPurchaseId() {
		return customerPurchaseId;
	}
	public void setCustomerPurchaseId(int customerPurchaseId) {
		this.customerPurchaseId = customerPurchaseId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}
	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}
	public String getCustomerPurchaseDate() {
		return customerPurchaseDate;
	}
	public void setCustomerPurchaseDate(String customerPurchaseDate) {
		this.customerPurchaseDate = customerPurchaseDate;
	}
	@Override
	public String toString() {
		return "MobilePurchaseDTO [mobileId=" + mobileId + ", customerName=" + customerName + ", customerEmailId="
				+ customerEmailId + ", customerPhoneNo=" + customerPhoneNo + "]";
	}
	public MobilePurchaseDTO()
	{
		
	}
	public MobilePurchaseDTO(int mobileId, String mobileName, int mobilePrice, String mobileQuantity) 
	{
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobilePrice = mobilePrice;
		this.mobileQuantity = mobileQuantity;
	}
	public MobilePurchaseDTO(int mobileId, String customerName, String customerEmailId, String customerPhoneNo)
	{
		super();
		this.mobileId = mobileId;
		this.customerName = customerName;
		this.customerEmailId = customerEmailId;
		this.customerPhoneNo = customerPhoneNo;

	}
	
	
}
