package com.techelevator;

public class VendingMachineItem {
	
	private int inventory = 5;
	private String product;
	private double price;
	private String productType;
	private String itemKey;
	private String itemMessage;
	
	
	
	public VendingMachineItem(String[] productInfo) {
		this.itemKey = productInfo[0];
		this.product = productInfo[1];								///just using the format given in vendingmachine.csv to assign elements of string array to their appropriate instance variables
		this.price = Double.parseDouble(productInfo[2]);
		this.productType = productInfo[3];
		this.itemMessage = productInfo[4];
	}
		
	public String getItemMessage() {
		return itemMessage;
	}
	
	public String getItemKey() {
		return itemKey;
	}

	public String getProduct() {
		return product;
	}

	public double getPrice() {
		return price;
	}

	public String getProductType() {
		return productType;
	}
	
	public int getInventory() {
		return inventory;
	}
	
	public void setInventory() {
		this.inventory--;
	}
	/*@Override
	public String toString() {
		return this.itemKey + ": " + this.product + " " + this.price + " " + this.productType;
	}*/
	
	

}
