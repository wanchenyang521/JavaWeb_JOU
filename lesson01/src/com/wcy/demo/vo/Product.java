package com.wcy.demo.vo;

public class Product {
	private String productCode;
	private String productName;
	private String productVendor;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductVendor() {
		return productVendor;
	}
	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName="
				+ productName + ", productVendor=" + productVendor + "]";
	}
	public Product(String productCode, String productName, String productVendor) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productVendor = productVendor;
	}
	
	
	
}
