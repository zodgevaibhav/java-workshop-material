package product_management;

public class Product {
	
	String name;
	int quantity;
	String price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void printProduct() // Function Definition
	{
		System.out.println("Product Name : " + name);
		System.out.println("Quantity : " + quantity);
		System.out.println("price : " + price);
	}
}
