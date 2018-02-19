
public class Vegetable {
	
	public String productcode;
	
	public String description;
	
	public double price;
	
	public int productcount;
	
	//Constructor
	public Vegetable(String productcode, String description, double price, int productcount) {
		
		this.productcode = productcode;
		
		this.description = description;
		
		this.price = price;
		
		this.productcount = productcount;
		
	}
	
	//Generate getters and setters

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getProductcount() {
		return productcount;
	}

	public void setProductcount(int productcount) {
		this.productcount = productcount;
	}
	
	

}
