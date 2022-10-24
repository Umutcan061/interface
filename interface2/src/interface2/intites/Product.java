package interface2.intites;

public class Product {
	private int id;
	private String name;
	private int unitPrice;
	private int stochPrice;

	public Product() {

	}

	public Product(int id, String name, int unitPrice, int stochPrice) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.stochPrice = stochPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getStochPrice() {
		return stochPrice;
	}

	public void setStochPrice(int stochPrice) {
		this.stochPrice = stochPrice;
	}

}
