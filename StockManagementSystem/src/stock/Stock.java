package stock;

public class Stock {
	String name;
	int id;
	int sale;
	int stockinput;

	public Stock() {
		
	}
	public Stock(String name, int id, int sale, int stockinput) {
		this.name = name;
		this.id = id;
		this.sale = sale;
		this.stockinput = stockinput;
	}

	public void PrintInfo() {
		System.out.println("name: "+name+"\nid: "+id+"\nsale: "+sale+"\n1stockinput: "+stockinput);
	}

}