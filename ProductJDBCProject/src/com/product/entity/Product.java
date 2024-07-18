package com.product.entity;

//shopping web site

//product
//supplier
//bill/payment/invoice
//cart

public class Product {
	
	private int prod_id;
	private String prod_name;
	private String prod_desc;
	private int prod_price;
	private String prod_brand;
	private String prod_category;
	
	

	public Product(int prod_id, String prod_name, String prod_desc, int prod_price, String prod_brand,
			String prod_category) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_price = prod_price;
		this.prod_brand = prod_brand;
		this.prod_category = prod_category;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_desc() {
		return prod_desc;
	}

	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}

	public int getProd_price() {
		return prod_price;
	}

	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}

	public String getProd_brand() {
		return prod_brand;
	}

	public void setProd_brand(String prod_brand) {
		this.prod_brand = prod_brand;
	}

	public String getProd_category() {
		return prod_category;
	}

	public void setProd_category(String prod_category) {
		this.prod_category = prod_category;
	}

		
	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_desc=" + prod_desc + ", prod_price="
				+ prod_price + ", prod_brand=" + prod_brand + ", prod_category=" + prod_category + "]";
	}
	

	public static void main(String[] args) {
		
		

	}

}

