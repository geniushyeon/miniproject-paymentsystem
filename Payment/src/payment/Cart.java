package payment;

public class Cart {

	private String productName;
	private long productPrice;
	
	public Cart() {
		
	}

	public Cart(String productName, long productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Cart [productName=" + productName + ", productPrice=" + productPrice + "]";
	}


}
