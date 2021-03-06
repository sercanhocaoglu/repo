package main.java.com.trendyolcase.shoppingcart;

public class Product {
	private String productName;
	private Double price;
	private Category category;

	public Product(String productName, Double price, Category category) {
		this.productName = productName;
		this.price = price;
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}