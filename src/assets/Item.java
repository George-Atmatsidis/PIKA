package assets;

public class Item {
	private String code;
	private String name;
	private Integer price;
	private Integer stock;
	
	

	public Item(String code, String name, Integer price, Integer stock) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public Item(String code, String name, Integer price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getPrice() {
		return price;
	}



	public void setPrice(Integer price) {
		this.price = price;
	}



	public Integer getStock() {
		return stock;
	}



	public void setStock(Integer stock) {
		this.stock = stock;
	}



	public Item() {
		// TODO Auto-generated constructor stub
	}

}
